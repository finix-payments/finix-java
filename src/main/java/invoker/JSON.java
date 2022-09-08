/*
 * Finix API
 */


package invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .registerTypeAdapterFactory(new model.AdditionalBuyerCharges.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AdditionalPurchaseData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AdditionalPurchaseDataItemDataInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AdditionalPurchaseDataOrderDate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Address.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AdjustmentTransfersList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AdjustmentTransfersListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplePaySession.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplePaySessionRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Application.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationLinksApplicationProfile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationLinksSelf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationProfile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationProfileLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationProfileLinksApplication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationProfilesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationProfilesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationProfilesListLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationsList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ApplicationsListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AssociatedIdentity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AssociatedIdentityEntity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Authorization.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationCaptured.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationCapturedExternalResponsesInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationLinksDevice.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationLinksMerchantIdentity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationLinksTransfer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationsList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.AuthorizationsListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.BalanceTransfer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.BalanceTransferList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.BalanceTransferListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CardPresentDetails.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CardPresentDetailsEmvData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CardPresentInstrumentForm.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ComplianceForm.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ComplianceFormFiles.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ComplianceFormPciSaqA.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ConfigurationDetails.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ConfigurationDetailsCashbackOptions.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ConfigurationDetailsCashbackOptionsManualEntry.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ConfigurationDetailsTipOptions.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateApplicationRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAssociatedIdentityRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAssociatedIdentityRequestEntity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAssociatedIdentityRequestEntityBusinessAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAssociatedIdentityRequestEntityDob.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAssociatedIdentityRequestEntityIncorporationDate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAssociatedIdentityRequestEntityPersonalAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAuthorizationRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateAuthorizationRequest3dSecureAuthentication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateBalanceTransferRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateDevice.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateDisputeEvidenceRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateExternalLinkRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateFeeProfileRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateFeeRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateFileRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateIdentityRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateIdentityRequestAdditionalUnderwritingData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateIdentityRequestEntity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateIdentityRequestEntityPersonalAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateInstrumentUpdateRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateMerchantUnderwritingRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateOnboardingFormLinkRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateOnboardingFormRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateOnboardingFormRequestMerchantProcessorsInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateOnboardingFormRequestOnboardingData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateOnboardingFormRequestOnboardingLinkDetails.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreatePaymentInstrumentRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreatePaymentInstrumentRequestAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateProcessorRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateProcessorRequestConfig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateReversalRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateSettlementRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateSubscriptionAmountRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateSubscriptionAmountRequestFeeAmountData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateSubscriptionEnrollmentRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateSubscriptionScheduleRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateSubscriptionScheduleRequestFixedTimeIntervalOffset.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateSubscriptionScheduleRequestPeriodOffset.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateTransferRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateTransferRequest3dSecureAuthentication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateUserRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateVerificationRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateWebhookRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateWebhookRequestAuthentication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateWebhookRequestAuthenticationBasic.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.CreateWebhookRequestAuthenticationBearer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Device.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DeviceConfigDetails.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DeviceLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DeviceLinksMerchant.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Dispute.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputeEvidence.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputeEvidenceLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputeEvidenceList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputeEvidenceListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputeLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputeLinksTransfer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DisputesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.DownloadInstrumentUpdateQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error401Unauthorized.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error401UnauthorizedEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error401UnauthorizedEmbeddedErrorsInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error401UnauthorizedEmbeddedErrorsInnerLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error402PaymentRequired.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error402PaymentRequiredEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error402PaymentRequiredEmbeddedErrorsInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error402PaymentRequiredEmbeddedErrorsInnerLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error403ForbiddenList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error403ForbiddenListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error403ForbiddenListEmbeddedErrorsInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error404NotFoundList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error404NotFoundListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error404NotFoundListEmbeddedErrorsInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error406NotAcceptable.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error422InvalidFieldList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error422InvalidFieldListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Error422InvalidFieldListEmbeddedErrorsInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ErrorGeneric.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ExternalLink.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ExternalLinksList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ExternalLinksListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Fee.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FeeLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FeeProfile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FeeProfileLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FeeProfilesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FeeProfilesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FeesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FeesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FilesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.FilesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.GetDeviceQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentitiesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentitiesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Identity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityAdditionalUnderwritingData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityAdditionalUnderwritingDataCardVolumeDistribution.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityBusinessAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityDob.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityForm.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityFormBusinessAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityFormDob.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityFormIncorporationDate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityIncorporationDate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityEntityPersonalAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksApplication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksAssociatedIdentities.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksAuthorizations.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksDisputes.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksMerchants.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksPaymentInstruments.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksSelf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksSettlements.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksTransfers.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.IdentityLinksVerifications.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.InstrumentUpdate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.InstrumentUpdateLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.InstrumentUpdateLinksApplication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.InstrumentUpdateLinksPaymentInstrument.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListAuthorizationsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListBalanceTransfersQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListDisputeEvidenceQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListDisputesAdjustmentsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListDisputesQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListExternalLinksQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListFeeProfilesQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListFilesQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListIdentitiesQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListIdentityAssociatedIdentitiesQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListLinksNext.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListMerchantProfilesQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListMerchantVerificationsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListMerchantsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListPaymentInstrumentUpdatesQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListPaymentInstrumentVerificationsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListPaymentInstrumentsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListSettlementFundingTransfersQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListSettlementTransfersQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListSettlementsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListTransferReversalsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListTransfersQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListVerificationsQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ListWebhooksQueryParams.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.LogRef.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Merchant.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantLinksApplication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantLinksIdentity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantLinksMerchantProfile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantLinksVerification.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantLinksVerifications.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantProcessorDetails.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantProfile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantProfileLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantProfilesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantProfilesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantsList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.MerchantsListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ModelFile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Name.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.OnboardingForm.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.OnboardingFormLink.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.OnboardingFormOnboardingData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.OnboardingFormOnboardingLink.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PageCursor.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PageOffset.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrument.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentLinksAuthorizations.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentLinksTransfers.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentToken.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentTokenLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentTokenLinksVerifications.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentUpdatesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentUpdatesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentsList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.PaymentInstrumentsListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Processor.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ProcessorApplicationConfig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ProcessorApplicationConfigConfigurationTemplates.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ProcessorLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ProcessorSystemConfig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ProcessorSystemConfigConfig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ProcessorsList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.ProcessorsListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.RemoveSettlementTransfer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Settlement.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SettlementLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SettlementsList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SettlementsListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionAmount.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionAmountFeeAmountData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionAmountLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionAmountLinksSchedule.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionAmountList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionAmountListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionEnrollment.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionEnrollmentLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionEnrollmentLinksAmounts.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionEnrollmentLinksMerchant.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionEnrollmentLinksSchedule.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionEnrollmentList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionEnrollmentListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionSchedule.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionScheduleFixedTimeIntervalOffset.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionScheduleLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionScheduleLinksAmounts.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionSchedulePeriodOffset.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionSchedulesList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionSchedulesListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.SubscriptionSchedulesListLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Transfer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksDestination.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksDisputedTransfer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksDisputes.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksFeeProfile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksFees.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksParent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksPaymentInstruments.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksReversals.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransferLinksSource.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransfersList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.TransfersListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateApplicationProfileRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateAuthorizationRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateComplianceFormRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateComplianceFormRequestPciSaqA.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateDeviceRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateFeeRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateIdentityRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateIdentityRequestAdditionalUnderwritingData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateIdentityRequestEntity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateIdentityRequestEntityPersonalAddress.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateMerchantProfileRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateMerchantRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdatePaymentInstrumentRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateSettlementRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateSubscriptionEnrollmentRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateSubscriptionScheduleRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateTransferRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateUserRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UpdateWebhookRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UploadFileRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.User.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UserLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UsersList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UsersListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.UsersListPage.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Verification.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.VerificationLinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.VerificationLinksApplication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.VerificationLinksMerchant.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.VerificationsList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.VerificationsListEmbedded.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.Webhook.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.WebhookAuthentication.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.WebhooksList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new model.WebhooksListEmbedded.CustomTypeAdapterFactory())
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
