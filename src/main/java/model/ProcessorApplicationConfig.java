/*
 * Finix API
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Country;
import model.Currency;
import model.ProcessorApplicationConfigConfigurationTemplates;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import invoker.JSON;

/**
 * Details that configure how the &#x60;Processor&#x60; handles transactions.
 */
@ApiModel(description = "Details that configure how the `Processor` handles transactions.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessorApplicationConfig {
  public static final String SERIALIZED_NAME_ACH_SETTLEMENT_DELAY_DAYS = "ach_settlement_delay_days";
  @SerializedName(SERIALIZED_NAME_ACH_SETTLEMENT_DELAY_DAYS)
  private Long achSettlementDelayDays;

  public static final String SERIALIZED_NAME_ALLOW_SPLIT_PAYOUTS = "allow_split_payouts";
  @SerializedName(SERIALIZED_NAME_ALLOW_SPLIT_PAYOUTS)
  private Boolean allowSplitPayouts;

  /**
   * Gets or Sets allowedBusinessApplicationIds
   */
  @JsonAdapter(AllowedBusinessApplicationIdsEnum.Adapter.class)
  public enum AllowedBusinessApplicationIdsEnum {
    AA("AA"),
    
    BB("BB"),
    
    BI("BI"),
    
    CP("CP"),
    
    FD("FD"),
    
    FT("FT"),
    
    GD("GD"),
    
    GP("GP"),
    
    LO("LO"),
    
    CI("CI"),
    
    CO("CO"),
    
    MP("MP"),
    
    MD("MD"),
    
    OG("OG"),
    
    PD("PD"),
    
    PP("PP"),
    
    TU("TU"),
    
    WT("WT"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    AllowedBusinessApplicationIdsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static AllowedBusinessApplicationIdsEnum fromValue(String value) {
        for (AllowedBusinessApplicationIdsEnum b : AllowedBusinessApplicationIdsEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        AllowedBusinessApplicationIdsEnum unknownDefault = AllowedBusinessApplicationIdsEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<AllowedBusinessApplicationIdsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedBusinessApplicationIdsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedBusinessApplicationIdsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedBusinessApplicationIdsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_BUSINESS_APPLICATION_IDS = "allowed_business_application_ids";
  @SerializedName(SERIALIZED_NAME_ALLOWED_BUSINESS_APPLICATION_IDS)
  private List<AllowedBusinessApplicationIdsEnum> allowedBusinessApplicationIds = null;

  public static final String SERIALIZED_NAME_CARD_ACCEPTOR_ID_CODE = "card_acceptor_id_code";
  @SerializedName(SERIALIZED_NAME_CARD_ACCEPTOR_ID_CODE)
  private String cardAcceptorIdCode;

  public static final String SERIALIZED_NAME_CARD_ACCEPTOR_TERMINAL_ID = "card_acceptor_terminal_id";
  @SerializedName(SERIALIZED_NAME_CARD_ACCEPTOR_TERMINAL_ID)
  private String cardAcceptorTerminalId;

  public static final String SERIALIZED_NAME_CONFIGURATION_TEMPLATES = "configuration_templates";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_TEMPLATES)
  private ProcessorApplicationConfigConfigurationTemplates configurationTemplates;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCIES = "default_currencies";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCIES)
  private List<Currency> defaultCurrencies = null;

  /**
   * The Merchant Category Code of the &#x60;Merchan. 
   */
  @JsonAdapter(DefaultMccEnum.Adapter.class)
  public enum DefaultMccEnum {
    _0742("0742"),
    
    _0763("0763"),
    
    _0780("0780"),
    
    _1520("1520"),
    
    _1711("1711"),
    
    _1731("1731"),
    
    _1740("1740"),
    
    _1750("1750"),
    
    _1761("1761"),
    
    _1771("1771"),
    
    _1799("1799"),
    
    _2741("2741"),
    
    _2791("2791"),
    
    _2842("2842"),
    
    _3000("3000"),
    
    _3001("3001"),
    
    _3002("3002"),
    
    _3003("3003"),
    
    _3004("3004"),
    
    _3005("3005"),
    
    _3006("3006"),
    
    _3007("3007"),
    
    _3008("3008"),
    
    _3009("3009"),
    
    _3010("3010"),
    
    _3011("3011"),
    
    _3012("3012"),
    
    _3013("3013"),
    
    _3014("3014"),
    
    _3015("3015"),
    
    _3016("3016"),
    
    _3017("3017"),
    
    _3018("3018"),
    
    _3019("3019"),
    
    _3020("3020"),
    
    _3021("3021"),
    
    _3022("3022"),
    
    _3023("3023"),
    
    _3024("3024"),
    
    _3025("3025"),
    
    _3026("3026"),
    
    _3027("3027"),
    
    _3028("3028"),
    
    _3029("3029"),
    
    _3030("3030"),
    
    _3031("3031"),
    
    _3032("3032"),
    
    _3033("3033"),
    
    _3034("3034"),
    
    _3035("3035"),
    
    _3036("3036"),
    
    _3037("3037"),
    
    _3038("3038"),
    
    _3039("3039"),
    
    _3040("3040"),
    
    _3041("3041"),
    
    _3042("3042"),
    
    _3043("3043"),
    
    _3044("3044"),
    
    _3045("3045"),
    
    _3046("3046"),
    
    _3047("3047"),
    
    _3048("3048"),
    
    _3049("3049"),
    
    _3050("3050"),
    
    _3051("3051"),
    
    _3052("3052"),
    
    _3053("3053"),
    
    _3054("3054"),
    
    _3055("3055"),
    
    _3056("3056"),
    
    _3057("3057"),
    
    _3058("3058"),
    
    _3059("3059"),
    
    _3060("3060"),
    
    _3061("3061"),
    
    _3062("3062"),
    
    _3063("3063"),
    
    _3064("3064"),
    
    _3065("3065"),
    
    _3066("3066"),
    
    _3067("3067"),
    
    _3068("3068"),
    
    _3069("3069"),
    
    _3070("3070"),
    
    _3071("3071"),
    
    _3072("3072"),
    
    _3073("3073"),
    
    _3074("3074"),
    
    _3075("3075"),
    
    _3076("3076"),
    
    _3077("3077"),
    
    _3078("3078"),
    
    _3079("3079"),
    
    _3080("3080"),
    
    _3081("3081"),
    
    _3082("3082"),
    
    _3083("3083"),
    
    _3084("3084"),
    
    _3085("3085"),
    
    _3086("3086"),
    
    _3087("3087"),
    
    _3088("3088"),
    
    _3089("3089"),
    
    _3090("3090"),
    
    _3091("3091"),
    
    _3092("3092"),
    
    _3093("3093"),
    
    _3094("3094"),
    
    _3095("3095"),
    
    _3096("3096"),
    
    _3097("3097"),
    
    _3098("3098"),
    
    _3099("3099"),
    
    _3100("3100"),
    
    _3101("3101"),
    
    _3102("3102"),
    
    _3103("3103"),
    
    _3104("3104"),
    
    _3105("3105"),
    
    _3106("3106"),
    
    _3107("3107"),
    
    _3108("3108"),
    
    _3109("3109"),
    
    _3110("3110"),
    
    _3111("3111"),
    
    _3112("3112"),
    
    _3113("3113"),
    
    _3114("3114"),
    
    _3115("3115"),
    
    _3116("3116"),
    
    _3117("3117"),
    
    _3118("3118"),
    
    _3119("3119"),
    
    _3120("3120"),
    
    _3121("3121"),
    
    _3122("3122"),
    
    _3123("3123"),
    
    _3124("3124"),
    
    _3125("3125"),
    
    _3126("3126"),
    
    _3127("3127"),
    
    _3128("3128"),
    
    _3129("3129"),
    
    _3130("3130"),
    
    _3131("3131"),
    
    _3132("3132"),
    
    _3133("3133"),
    
    _3134("3134"),
    
    _3135("3135"),
    
    _3136("3136"),
    
    _3137("3137"),
    
    _3138("3138"),
    
    _3139("3139"),
    
    _3140("3140"),
    
    _3141("3141"),
    
    _3142("3142"),
    
    _3143("3143"),
    
    _3144("3144"),
    
    _3145("3145"),
    
    _3146("3146"),
    
    _3147("3147"),
    
    _3148("3148"),
    
    _3149("3149"),
    
    _3150("3150"),
    
    _3151("3151"),
    
    _3152("3152"),
    
    _3153("3153"),
    
    _3154("3154"),
    
    _3155("3155"),
    
    _3156("3156"),
    
    _3157("3157"),
    
    _3158("3158"),
    
    _3159("3159"),
    
    _3160("3160"),
    
    _3161("3161"),
    
    _3162("3162"),
    
    _3163("3163"),
    
    _3164("3164"),
    
    _3165("3165"),
    
    _3166("3166"),
    
    _3167("3167"),
    
    _3168("3168"),
    
    _3169("3169"),
    
    _3170("3170"),
    
    _3171("3171"),
    
    _3172("3172"),
    
    _3173("3173"),
    
    _3174("3174"),
    
    _3175("3175"),
    
    _3176("3176"),
    
    _3177("3177"),
    
    _3178("3178"),
    
    _3179("3179"),
    
    _3180("3180"),
    
    _3181("3181"),
    
    _3182("3182"),
    
    _3183("3183"),
    
    _3184("3184"),
    
    _3185("3185"),
    
    _3186("3186"),
    
    _3187("3187"),
    
    _3188("3188"),
    
    _3189("3189"),
    
    _3190("3190"),
    
    _3191("3191"),
    
    _3192("3192"),
    
    _3193("3193"),
    
    _3194("3194"),
    
    _3195("3195"),
    
    _3196("3196"),
    
    _3197("3197"),
    
    _3198("3198"),
    
    _3199("3199"),
    
    _3200("3200"),
    
    _3201("3201"),
    
    _3202("3202"),
    
    _3203("3203"),
    
    _3204("3204"),
    
    _3205("3205"),
    
    _3206("3206"),
    
    _3207("3207"),
    
    _3208("3208"),
    
    _3209("3209"),
    
    _3210("3210"),
    
    _3211("3211"),
    
    _3212("3212"),
    
    _3213("3213"),
    
    _3214("3214"),
    
    _3215("3215"),
    
    _3216("3216"),
    
    _3217("3217"),
    
    _3218("3218"),
    
    _3219("3219"),
    
    _3220("3220"),
    
    _3221("3221"),
    
    _3222("3222"),
    
    _3223("3223"),
    
    _3224("3224"),
    
    _3225("3225"),
    
    _3226("3226"),
    
    _3227("3227"),
    
    _3228("3228"),
    
    _3229("3229"),
    
    _3230("3230"),
    
    _3231("3231"),
    
    _3232("3232"),
    
    _3233("3233"),
    
    _3234("3234"),
    
    _3235("3235"),
    
    _3236("3236"),
    
    _3237("3237"),
    
    _3238("3238"),
    
    _3239("3239"),
    
    _3240("3240"),
    
    _3241("3241"),
    
    _3242("3242"),
    
    _3243("3243"),
    
    _3244("3244"),
    
    _3245("3245"),
    
    _3246("3246"),
    
    _3247("3247"),
    
    _3248("3248"),
    
    _3249("3249"),
    
    _3250("3250"),
    
    _3251("3251"),
    
    _3252("3252"),
    
    _3253("3253"),
    
    _3254("3254"),
    
    _3255("3255"),
    
    _3256("3256"),
    
    _3257("3257"),
    
    _3258("3258"),
    
    _3259("3259"),
    
    _3260("3260"),
    
    _3261("3261"),
    
    _3262("3262"),
    
    _3263("3263"),
    
    _3264("3264"),
    
    _3265("3265"),
    
    _3266("3266"),
    
    _3267("3267"),
    
    _3268("3268"),
    
    _3269("3269"),
    
    _3270("3270"),
    
    _3271("3271"),
    
    _3272("3272"),
    
    _3273("3273"),
    
    _3274("3274"),
    
    _3275("3275"),
    
    _3276("3276"),
    
    _3277("3277"),
    
    _3278("3278"),
    
    _3279("3279"),
    
    _3280("3280"),
    
    _3281("3281"),
    
    _3282("3282"),
    
    _3283("3283"),
    
    _3284("3284"),
    
    _3285("3285"),
    
    _3286("3286"),
    
    _3287("3287"),
    
    _3288("3288"),
    
    _3289("3289"),
    
    _3290("3290"),
    
    _3291("3291"),
    
    _3292("3292"),
    
    _3293("3293"),
    
    _3294("3294"),
    
    _3295("3295"),
    
    _3296("3296"),
    
    _3297("3297"),
    
    _3298("3298"),
    
    _3299("3299"),
    
    _3351("3351"),
    
    _3352("3352"),
    
    _3353("3353"),
    
    _3354("3354"),
    
    _3355("3355"),
    
    _3356("3356"),
    
    _3357("3357"),
    
    _3358("3358"),
    
    _3359("3359"),
    
    _3360("3360"),
    
    _3361("3361"),
    
    _3362("3362"),
    
    _3363("3363"),
    
    _3364("3364"),
    
    _3365("3365"),
    
    _3366("3366"),
    
    _3367("3367"),
    
    _3368("3368"),
    
    _3369("3369"),
    
    _3370("3370"),
    
    _3371("3371"),
    
    _3372("3372"),
    
    _3373("3373"),
    
    _3374("3374"),
    
    _3375("3375"),
    
    _3376("3376"),
    
    _3377("3377"),
    
    _3378("3378"),
    
    _3379("3379"),
    
    _3380("3380"),
    
    _3381("3381"),
    
    _3382("3382"),
    
    _3383("3383"),
    
    _3384("3384"),
    
    _3385("3385"),
    
    _3386("3386"),
    
    _3387("3387"),
    
    _3388("3388"),
    
    _3389("3389"),
    
    _3390("3390"),
    
    _3391("3391"),
    
    _3392("3392"),
    
    _3393("3393"),
    
    _3394("3394"),
    
    _3395("3395"),
    
    _3396("3396"),
    
    _3397("3397"),
    
    _3398("3398"),
    
    _3399("3399"),
    
    _3400("3400"),
    
    _3401("3401"),
    
    _3402("3402"),
    
    _3403("3403"),
    
    _3404("3404"),
    
    _3405("3405"),
    
    _3406("3406"),
    
    _3407("3407"),
    
    _3408("3408"),
    
    _3409("3409"),
    
    _3410("3410"),
    
    _3411("3411"),
    
    _3412("3412"),
    
    _3413("3413"),
    
    _3414("3414"),
    
    _3415("3415"),
    
    _3416("3416"),
    
    _3417("3417"),
    
    _3418("3418"),
    
    _3419("3419"),
    
    _3420("3420"),
    
    _3421("3421"),
    
    _3422("3422"),
    
    _3423("3423"),
    
    _3424("3424"),
    
    _3425("3425"),
    
    _3426("3426"),
    
    _3427("3427"),
    
    _3428("3428"),
    
    _3429("3429"),
    
    _3430("3430"),
    
    _3431("3431"),
    
    _3432("3432"),
    
    _3433("3433"),
    
    _3434("3434"),
    
    _3435("3435"),
    
    _3436("3436"),
    
    _3437("3437"),
    
    _3438("3438"),
    
    _3439("3439"),
    
    _3440("3440"),
    
    _3441("3441"),
    
    _3501("3501"),
    
    _3502("3502"),
    
    _3503("3503"),
    
    _3504("3504"),
    
    _3505("3505"),
    
    _3506("3506"),
    
    _3507("3507"),
    
    _3508("3508"),
    
    _3509("3509"),
    
    _3510("3510"),
    
    _3511("3511"),
    
    _3512("3512"),
    
    _3513("3513"),
    
    _3514("3514"),
    
    _3515("3515"),
    
    _3516("3516"),
    
    _3517("3517"),
    
    _3518("3518"),
    
    _3519("3519"),
    
    _3520("3520"),
    
    _3521("3521"),
    
    _3522("3522"),
    
    _3523("3523"),
    
    _3524("3524"),
    
    _3525("3525"),
    
    _3526("3526"),
    
    _3527("3527"),
    
    _3528("3528"),
    
    _3529("3529"),
    
    _3530("3530"),
    
    _3531("3531"),
    
    _3532("3532"),
    
    _3533("3533"),
    
    _3534("3534"),
    
    _3535("3535"),
    
    _3536("3536"),
    
    _3537("3537"),
    
    _3538("3538"),
    
    _3539("3539"),
    
    _3540("3540"),
    
    _3541("3541"),
    
    _3542("3542"),
    
    _3543("3543"),
    
    _3544("3544"),
    
    _3545("3545"),
    
    _3546("3546"),
    
    _3547("3547"),
    
    _3548("3548"),
    
    _3549("3549"),
    
    _3550("3550"),
    
    _3551("3551"),
    
    _3552("3552"),
    
    _3553("3553"),
    
    _3554("3554"),
    
    _3555("3555"),
    
    _3556("3556"),
    
    _3557("3557"),
    
    _3558("3558"),
    
    _3559("3559"),
    
    _3560("3560"),
    
    _3561("3561"),
    
    _3562("3562"),
    
    _3563("3563"),
    
    _3564("3564"),
    
    _3565("3565"),
    
    _3566("3566"),
    
    _3567("3567"),
    
    _3568("3568"),
    
    _3569("3569"),
    
    _3570("3570"),
    
    _3571("3571"),
    
    _3572("3572"),
    
    _3573("3573"),
    
    _3574("3574"),
    
    _3575("3575"),
    
    _3576("3576"),
    
    _3577("3577"),
    
    _3578("3578"),
    
    _3579("3579"),
    
    _3580("3580"),
    
    _3581("3581"),
    
    _3582("3582"),
    
    _3583("3583"),
    
    _3584("3584"),
    
    _3585("3585"),
    
    _3586("3586"),
    
    _3587("3587"),
    
    _3588("3588"),
    
    _3589("3589"),
    
    _3590("3590"),
    
    _3591("3591"),
    
    _3592("3592"),
    
    _3593("3593"),
    
    _3594("3594"),
    
    _3595("3595"),
    
    _3596("3596"),
    
    _3597("3597"),
    
    _3598("3598"),
    
    _3599("3599"),
    
    _3600("3600"),
    
    _3601("3601"),
    
    _3602("3602"),
    
    _3603("3603"),
    
    _3604("3604"),
    
    _3605("3605"),
    
    _3606("3606"),
    
    _3607("3607"),
    
    _3608("3608"),
    
    _3609("3609"),
    
    _3610("3610"),
    
    _3611("3611"),
    
    _3612("3612"),
    
    _3613("3613"),
    
    _3614("3614"),
    
    _3615("3615"),
    
    _3616("3616"),
    
    _3617("3617"),
    
    _3618("3618"),
    
    _3619("3619"),
    
    _3620("3620"),
    
    _3621("3621"),
    
    _3622("3622"),
    
    _3623("3623"),
    
    _3624("3624"),
    
    _3625("3625"),
    
    _3626("3626"),
    
    _3627("3627"),
    
    _3628("3628"),
    
    _3629("3629"),
    
    _3630("3630"),
    
    _3631("3631"),
    
    _3632("3632"),
    
    _3633("3633"),
    
    _3634("3634"),
    
    _3635("3635"),
    
    _3636("3636"),
    
    _3637("3637"),
    
    _3638("3638"),
    
    _3639("3639"),
    
    _3640("3640"),
    
    _3641("3641"),
    
    _3642("3642"),
    
    _3643("3643"),
    
    _3644("3644"),
    
    _3645("3645"),
    
    _3646("3646"),
    
    _3647("3647"),
    
    _3648("3648"),
    
    _3649("3649"),
    
    _3650("3650"),
    
    _3651("3651"),
    
    _3652("3652"),
    
    _3653("3653"),
    
    _3654("3654"),
    
    _3655("3655"),
    
    _3656("3656"),
    
    _3657("3657"),
    
    _3658("3658"),
    
    _3659("3659"),
    
    _3660("3660"),
    
    _3661("3661"),
    
    _3662("3662"),
    
    _3663("3663"),
    
    _3664("3664"),
    
    _3665("3665"),
    
    _3666("3666"),
    
    _3667("3667"),
    
    _3668("3668"),
    
    _3669("3669"),
    
    _3670("3670"),
    
    _3671("3671"),
    
    _3672("3672"),
    
    _3673("3673"),
    
    _3674("3674"),
    
    _3675("3675"),
    
    _3676("3676"),
    
    _3677("3677"),
    
    _3678("3678"),
    
    _3679("3679"),
    
    _3680("3680"),
    
    _3681("3681"),
    
    _3682("3682"),
    
    _3683("3683"),
    
    _3684("3684"),
    
    _3685("3685"),
    
    _3686("3686"),
    
    _3687("3687"),
    
    _3688("3688"),
    
    _3689("3689"),
    
    _3690("3690"),
    
    _3691("3691"),
    
    _3692("3692"),
    
    _3693("3693"),
    
    _3694("3694"),
    
    _3695("3695"),
    
    _3696("3696"),
    
    _3697("3697"),
    
    _3698("3698"),
    
    _3699("3699"),
    
    _3700("3700"),
    
    _3701("3701"),
    
    _3702("3702"),
    
    _3703("3703"),
    
    _3704("3704"),
    
    _3705("3705"),
    
    _3706("3706"),
    
    _3707("3707"),
    
    _3708("3708"),
    
    _3709("3709"),
    
    _3710("3710"),
    
    _3711("3711"),
    
    _3712("3712"),
    
    _3713("3713"),
    
    _3714("3714"),
    
    _3715("3715"),
    
    _3716("3716"),
    
    _3717("3717"),
    
    _3718("3718"),
    
    _3719("3719"),
    
    _3720("3720"),
    
    _3721("3721"),
    
    _3722("3722"),
    
    _3723("3723"),
    
    _3724("3724"),
    
    _3725("3725"),
    
    _3726("3726"),
    
    _3727("3727"),
    
    _3728("3728"),
    
    _3729("3729"),
    
    _3730("3730"),
    
    _3731("3731"),
    
    _3732("3732"),
    
    _3733("3733"),
    
    _3734("3734"),
    
    _3735("3735"),
    
    _3736("3736"),
    
    _3737("3737"),
    
    _3738("3738"),
    
    _3739("3739"),
    
    _3740("3740"),
    
    _3741("3741"),
    
    _3742("3742"),
    
    _3743("3743"),
    
    _3744("3744"),
    
    _3745("3745"),
    
    _3746("3746"),
    
    _3747("3747"),
    
    _3748("3748"),
    
    _3749("3749"),
    
    _3750("3750"),
    
    _3751("3751"),
    
    _3752("3752"),
    
    _3753("3753"),
    
    _3754("3754"),
    
    _3755("3755"),
    
    _3756("3756"),
    
    _3757("3757"),
    
    _3758("3758"),
    
    _3759("3759"),
    
    _3760("3760"),
    
    _3761("3761"),
    
    _3762("3762"),
    
    _3763("3763"),
    
    _3764("3764"),
    
    _3765("3765"),
    
    _3766("3766"),
    
    _3767("3767"),
    
    _3768("3768"),
    
    _3769("3769"),
    
    _3770("3770"),
    
    _3771("3771"),
    
    _3772("3772"),
    
    _3773("3773"),
    
    _3774("3774"),
    
    _3775("3775"),
    
    _3776("3776"),
    
    _3777("3777"),
    
    _3778("3778"),
    
    _3779("3779"),
    
    _3780("3780"),
    
    _3781("3781"),
    
    _3782("3782"),
    
    _3783("3783"),
    
    _3784("3784"),
    
    _3785("3785"),
    
    _3786("3786"),
    
    _3787("3787"),
    
    _3788("3788"),
    
    _3789("3789"),
    
    _3790("3790"),
    
    _3816("3816"),
    
    _3835("3835"),
    
    _4011("4011"),
    
    _4111("4111"),
    
    _4112("4112"),
    
    _4119("4119"),
    
    _4121("4121"),
    
    _4131("4131"),
    
    _4214("4214"),
    
    _4215("4215"),
    
    _4225("4225"),
    
    _4411("4411"),
    
    _4457("4457"),
    
    _4468("4468"),
    
    _4511("4511"),
    
    _4582("4582"),
    
    _4722("4722"),
    
    _4723("4723"),
    
    _4784("4784"),
    
    _4789("4789"),
    
    _4812("4812"),
    
    _4814("4814"),
    
    _4815("4815"),
    
    _4816("4816"),
    
    _4821("4821"),
    
    _4829("4829"),
    
    _4899("4899"),
    
    _4900("4900"),
    
    _5013("5013"),
    
    _5021("5021"),
    
    _5039("5039"),
    
    _5044("5044"),
    
    _5045("5045"),
    
    _5046("5046"),
    
    _5047("5047"),
    
    _5051("5051"),
    
    _5065("5065"),
    
    _5072("5072"),
    
    _5074("5074"),
    
    _5085("5085"),
    
    _5094("5094"),
    
    _5099("5099"),
    
    _5111("5111"),
    
    _5122("5122"),
    
    _5131("5131"),
    
    _5137("5137"),
    
    _5139("5139"),
    
    _5169("5169"),
    
    _5172("5172"),
    
    _5192("5192"),
    
    _5193("5193"),
    
    _5198("5198"),
    
    _5199("5199"),
    
    _5200("5200"),
    
    _5211("5211"),
    
    _5231("5231"),
    
    _5251("5251"),
    
    _5261("5261"),
    
    _5271("5271"),
    
    _5300("5300"),
    
    _5309("5309"),
    
    _5310("5310"),
    
    _5311("5311"),
    
    _5331("5331"),
    
    _5399("5399"),
    
    _5411("5411"),
    
    _5422("5422"),
    
    _5441("5441"),
    
    _5451("5451"),
    
    _5462("5462"),
    
    _5499("5499"),
    
    _5511("5511"),
    
    _5521("5521"),
    
    _5531("5531"),
    
    _5532("5532"),
    
    _5533("5533"),
    
    _5541("5541"),
    
    _5542("5542"),
    
    _5551("5551"),
    
    _5561("5561"),
    
    _5571("5571"),
    
    _5592("5592"),
    
    _5598("5598"),
    
    _5599("5599"),
    
    _5611("5611"),
    
    _5621("5621"),
    
    _5631("5631"),
    
    _5641("5641"),
    
    _5651("5651"),
    
    _5655("5655"),
    
    _5661("5661"),
    
    _5681("5681"),
    
    _5691("5691"),
    
    _5697("5697"),
    
    _5698("5698"),
    
    _5699("5699"),
    
    _5712("5712"),
    
    _5713("5713"),
    
    _5714("5714"),
    
    _5718("5718"),
    
    _5719("5719"),
    
    _5722("5722"),
    
    _5732("5732"),
    
    _5733("5733"),
    
    _5734("5734"),
    
    _5735("5735"),
    
    _5811("5811"),
    
    _5812("5812"),
    
    _5813("5813"),
    
    _5814("5814"),
    
    _5815("5815"),
    
    _5816("5816"),
    
    _5817("5817"),
    
    _5818("5818"),
    
    _5832("5832"),
    
    _5912("5912"),
    
    _5921("5921"),
    
    _5931("5931"),
    
    _5932("5932"),
    
    _5933("5933"),
    
    _5935("5935"),
    
    _5937("5937"),
    
    _5940("5940"),
    
    _5941("5941"),
    
    _5942("5942"),
    
    _5943("5943"),
    
    _5944("5944"),
    
    _5945("5945"),
    
    _5946("5946"),
    
    _5947("5947"),
    
    _5948("5948"),
    
    _5949("5949"),
    
    _5950("5950"),
    
    _5960("5960"),
    
    _5961("5961"),
    
    _5962("5962"),
    
    _5963("5963"),
    
    _5964("5964"),
    
    _5965("5965"),
    
    _5966("5966"),
    
    _5967("5967"),
    
    _5968("5968"),
    
    _5969("5969"),
    
    _5970("5970"),
    
    _5971("5971"),
    
    _5972("5972"),
    
    _5973("5973"),
    
    _5975("5975"),
    
    _5976("5976"),
    
    _5977("5977"),
    
    _5978("5978"),
    
    _5983("5983"),
    
    _5992("5992"),
    
    _5993("5993"),
    
    _5994("5994"),
    
    _5995("5995"),
    
    _5996("5996"),
    
    _5997("5997"),
    
    _5998("5998"),
    
    _5999("5999"),
    
    _6010("6010"),
    
    _6011("6011"),
    
    _6012("6012"),
    
    _6051("6051"),
    
    _6211("6211"),
    
    _6300("6300"),
    
    _6381("6381"),
    
    _6399("6399"),
    
    _6513("6513"),
    
    _7011("7011"),
    
    _7012("7012"),
    
    _7032("7032"),
    
    _7033("7033"),
    
    _7210("7210"),
    
    _7211("7211"),
    
    _7216("7216"),
    
    _7217("7217"),
    
    _7221("7221"),
    
    _7230("7230"),
    
    _7251("7251"),
    
    _7261("7261"),
    
    _7273("7273"),
    
    _7276("7276"),
    
    _7277("7277"),
    
    _7278("7278"),
    
    _7296("7296"),
    
    _7297("7297"),
    
    _7298("7298"),
    
    _7299("7299"),
    
    _7311("7311"),
    
    _7321("7321"),
    
    _7332("7332"),
    
    _7333("7333"),
    
    _7338("7338"),
    
    _7339("7339"),
    
    _7342("7342"),
    
    _7349("7349"),
    
    _7361("7361"),
    
    _7372("7372"),
    
    _7375("7375"),
    
    _7379("7379"),
    
    _7392("7392"),
    
    _7393("7393"),
    
    _7394("7394"),
    
    _7395("7395"),
    
    _7399("7399"),
    
    _7511("7511"),
    
    _7512("7512"),
    
    _7513("7513"),
    
    _7519("7519"),
    
    _7523("7523"),
    
    _7531("7531"),
    
    _7534("7534"),
    
    _7535("7535"),
    
    _7538("7538"),
    
    _7542("7542"),
    
    _7549("7549"),
    
    _7622("7622"),
    
    _7623("7623"),
    
    _7629("7629"),
    
    _7631("7631"),
    
    _7641("7641"),
    
    _7692("7692"),
    
    _7699("7699"),
    
    _7800("7800"),
    
    _7801("7801"),
    
    _7802("7802"),
    
    _7829("7829"),
    
    _7832("7832"),
    
    _7841("7841"),
    
    _7911("7911"),
    
    _7922("7922"),
    
    _7929("7929"),
    
    _7932("7932"),
    
    _7933("7933"),
    
    _7941("7941"),
    
    _7991("7991"),
    
    _7992("7992"),
    
    _7993("7993"),
    
    _7994("7994"),
    
    _7995("7995"),
    
    _7996("7996"),
    
    _7997("7997"),
    
    _7998("7998"),
    
    _7999("7999"),
    
    _8011("8011"),
    
    _8021("8021"),
    
    _8031("8031"),
    
    _8041("8041"),
    
    _8042("8042"),
    
    _8043("8043"),
    
    _8044("8044"),
    
    _8049("8049"),
    
    _8050("8050"),
    
    _8062("8062"),
    
    _8071("8071"),
    
    _8099("8099"),
    
    _8111("8111"),
    
    _8211("8211"),
    
    _8220("8220"),
    
    _8241("8241"),
    
    _8244("8244"),
    
    _8249("8249"),
    
    _8299("8299"),
    
    _8351("8351"),
    
    _8398("8398"),
    
    _8641("8641"),
    
    _8651("8651"),
    
    _8661("8661"),
    
    _8675("8675"),
    
    _8699("8699"),
    
    _8734("8734"),
    
    _8911("8911"),
    
    _8931("8931"),
    
    _8999("8999"),
    
    _9211("9211"),
    
    _9222("9222"),
    
    _9223("9223"),
    
    _9311("9311"),
    
    _9399("9399"),
    
    _9402("9402"),
    
    _9405("9405"),
    
    _9700("9700"),
    
    _9701("9701"),
    
    _9702("9702"),
    
    _9950("9950"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    DefaultMccEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static DefaultMccEnum fromValue(String value) {
        for (DefaultMccEnum b : DefaultMccEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        DefaultMccEnum unknownDefault = DefaultMccEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<DefaultMccEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultMccEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultMccEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultMccEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_MCC = "default_mcc";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MCC)
  private DefaultMccEnum defaultMcc;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_ACCOUNT_NUMBER = "default_sender_account_number";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_ACCOUNT_NUMBER)
  private String defaultSenderAccountNumber;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_ADDRESS = "default_sender_address";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_ADDRESS)
  private String defaultSenderAddress;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_CITY = "default_sender_city";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_CITY)
  private String defaultSenderCity;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_COUNTRY = "default_sender_country";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_COUNTRY)
  private Country defaultSenderCountry;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_COUNTRY_CODE = "default_sender_country_code";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_COUNTRY_CODE)
  private String defaultSenderCountryCode;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_COUNTY_CODE = "default_sender_county_code";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_COUNTY_CODE)
  private String defaultSenderCountyCode;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_NAME = "default_sender_name";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_NAME)
  private String defaultSenderName;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_STATE_CODE = "default_sender_state_code";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_STATE_CODE)
  private String defaultSenderStateCode;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_ZIP_CODE = "default_sender_zip_code";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_ZIP_CODE)
  private String defaultSenderZipCode;

  public static final String SERIALIZED_NAME_INCLUDE_COLOMBIA_DATA = "include_colombia_data";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COLOMBIA_DATA)
  private Boolean includeColombiaData;

  /**
   * Identifies the level of security used in an electronic commerce transaction (only applies to card-present transactions).
   */
  @JsonAdapter(MotoEciindicatorEnum.Adapter.class)
  public enum MotoEciindicatorEnum {
    _5("5"),
    
    _6("6"),
    
    _7("7"),
    
    _8("8"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    MotoEciindicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static MotoEciindicatorEnum fromValue(String value) {
        for (MotoEciindicatorEnum b : MotoEciindicatorEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        MotoEciindicatorEnum unknownDefault = MotoEciindicatorEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<MotoEciindicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MotoEciindicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MotoEciindicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MotoEciindicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MOTO_ECIINDICATOR = "moto_eciindicator";
  @SerializedName(SERIALIZED_NAME_MOTO_ECIINDICATOR)
  private MotoEciindicatorEnum motoEciindicator;

  /**
   * A 2-digit code that identifies the method used to enter the cardholder account number and card expiration date (only applies to card-present transactions).
   */
  @JsonAdapter(PanEntryModeEnum.Adapter.class)
  public enum PanEntryModeEnum {
    _00("00"),
    
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _80("80"),
    
    _82("82"),
    
    _83("83"),
    
    _90("90"),
    
    _91("91"),
    
    _95("95"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    PanEntryModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static PanEntryModeEnum fromValue(String value) {
        for (PanEntryModeEnum b : PanEntryModeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        PanEntryModeEnum unknownDefault = PanEntryModeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<PanEntryModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PanEntryModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PanEntryModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PanEntryModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAN_ENTRY_MODE = "pan_entry_mode";
  @SerializedName(SERIALIZED_NAME_PAN_ENTRY_MODE)
  private PanEntryModeEnum panEntryMode;

  /**
   * Contains a code identifying transaction conditions at the point of sale or point of service (only applies to card-present transactions).
   */
  @JsonAdapter(PosConditionCodeEnum.Adapter.class)
  public enum PosConditionCodeEnum {
    _00("00"),
    
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _05("05"),
    
    _06("06"),
    
    _08("08"),
    
    _10("10"),
    
    _51("51"),
    
    _59("59"),
    
    _71("71"),
    
    _73("73"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    PosConditionCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static PosConditionCodeEnum fromValue(String value) {
        for (PosConditionCodeEnum b : PosConditionCodeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        PosConditionCodeEnum unknownDefault = PosConditionCodeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<PosConditionCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PosConditionCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PosConditionCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PosConditionCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POS_CONDITION_CODE = "pos_condition_code";
  @SerializedName(SERIALIZED_NAME_POS_CONDITION_CODE)
  private PosConditionCodeEnum posConditionCode;

  public ProcessorApplicationConfig() { 
  }

  public ProcessorApplicationConfig achSettlementDelayDays(Long achSettlementDelayDays) {
    
    this.achSettlementDelayDays = achSettlementDelayDays;
    return this;
  }

   /**
   * Details how days ACH settlments are delayed by.
   * minimum: 0
   * @return achSettlementDelayDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details how days ACH settlments are delayed by.")

  public Long getAchSettlementDelayDays() {
    return achSettlementDelayDays;
  }


  public void setAchSettlementDelayDays(Long achSettlementDelayDays) {
    this.achSettlementDelayDays = achSettlementDelayDays;
  }


  public ProcessorApplicationConfig allowSplitPayouts(Boolean allowSplitPayouts) {
    
    this.allowSplitPayouts = allowSplitPayouts;
    return this;
  }

   /**
   * Details if the &#x60;Processor&#x60; allows split payouts to &#x60;Merchants&#x60;.
   * @return allowSplitPayouts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Processor` allows split payouts to `Merchants`.")

  public Boolean getAllowSplitPayouts() {
    return allowSplitPayouts;
  }


  public void setAllowSplitPayouts(Boolean allowSplitPayouts) {
    this.allowSplitPayouts = allowSplitPayouts;
  }


  public ProcessorApplicationConfig allowedBusinessApplicationIds(List<AllowedBusinessApplicationIdsEnum> allowedBusinessApplicationIds) {
    
    this.allowedBusinessApplicationIds = allowedBusinessApplicationIds;
    return this;
  }

  public ProcessorApplicationConfig addAllowedBusinessApplicationIdsItem(AllowedBusinessApplicationIdsEnum allowedBusinessApplicationIdsItem) {
    if (this.allowedBusinessApplicationIds == null) {
      this.allowedBusinessApplicationIds = new ArrayList<>();
    }
    this.allowedBusinessApplicationIds.add(allowedBusinessApplicationIdsItem);
    return this;
  }

   /**
   * Identifies the &#x60;Processors&#x60; business application type for VisaNet transaction processing.
   * @return allowedBusinessApplicationIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the `Processors` business application type for VisaNet transaction processing.")

  public List<AllowedBusinessApplicationIdsEnum> getAllowedBusinessApplicationIds() {
    return allowedBusinessApplicationIds;
  }


  public void setAllowedBusinessApplicationIds(List<AllowedBusinessApplicationIdsEnum> allowedBusinessApplicationIds) {
    this.allowedBusinessApplicationIds = allowedBusinessApplicationIds;
  }


  public ProcessorApplicationConfig cardAcceptorIdCode(String cardAcceptorIdCode) {
    
    this.cardAcceptorIdCode = cardAcceptorIdCode;
    return this;
  }

   /**
   * An ID for the card acceptor (e.g Visa). 
   * @return cardAcceptorIdCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An ID for the card acceptor (e.g Visa). ")

  public String getCardAcceptorIdCode() {
    return cardAcceptorIdCode;
  }


  public void setCardAcceptorIdCode(String cardAcceptorIdCode) {
    this.cardAcceptorIdCode = cardAcceptorIdCode;
  }


  public ProcessorApplicationConfig cardAcceptorTerminalId(String cardAcceptorTerminalId) {
    
    this.cardAcceptorTerminalId = cardAcceptorTerminalId;
    return this;
  }

   /**
   * The ID for the terminal at a card acceptor location.
   * @return cardAcceptorTerminalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for the terminal at a card acceptor location.")

  public String getCardAcceptorTerminalId() {
    return cardAcceptorTerminalId;
  }


  public void setCardAcceptorTerminalId(String cardAcceptorTerminalId) {
    this.cardAcceptorTerminalId = cardAcceptorTerminalId;
  }


  public ProcessorApplicationConfig configurationTemplates(ProcessorApplicationConfigConfigurationTemplates configurationTemplates) {
    
    this.configurationTemplates = configurationTemplates;
    return this;
  }

   /**
   * Get configurationTemplates
   * @return configurationTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorApplicationConfigConfigurationTemplates getConfigurationTemplates() {
    return configurationTemplates;
  }


  public void setConfigurationTemplates(ProcessorApplicationConfigConfigurationTemplates configurationTemplates) {
    this.configurationTemplates = configurationTemplates;
  }


  public ProcessorApplicationConfig defaultCurrencies(List<Currency> defaultCurrencies) {
    
    this.defaultCurrencies = defaultCurrencies;
    return this;
  }

  public ProcessorApplicationConfig addDefaultCurrenciesItem(Currency defaultCurrenciesItem) {
    if (this.defaultCurrencies == null) {
      this.defaultCurrencies = new ArrayList<>();
    }
    this.defaultCurrencies.add(defaultCurrenciesItem);
    return this;
  }

   /**
   * ISO 4217 3 letter currency code.
   * @return defaultCurrencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 3 letter currency code.")

  public List<Currency> getDefaultCurrencies() {
    return defaultCurrencies;
  }


  public void setDefaultCurrencies(List<Currency> defaultCurrencies) {
    this.defaultCurrencies = defaultCurrencies;
  }


  public ProcessorApplicationConfig defaultMcc(DefaultMccEnum defaultMcc) {
    
    this.defaultMcc = defaultMcc;
    return this;
  }

   /**
   * The Merchant Category Code of the &#x60;Merchan. 
   * @return defaultMcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Merchant Category Code of the `Merchan. ")

  public DefaultMccEnum getDefaultMcc() {
    return defaultMcc;
  }


  public void setDefaultMcc(DefaultMccEnum defaultMcc) {
    this.defaultMcc = defaultMcc;
  }


  public ProcessorApplicationConfig defaultSenderAccountNumber(String defaultSenderAccountNumber) {
    
    this.defaultSenderAccountNumber = defaultSenderAccountNumber;
    return this;
  }

   /**
   * The default account of the sender.
   * @return defaultSenderAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default account of the sender.")

  public String getDefaultSenderAccountNumber() {
    return defaultSenderAccountNumber;
  }


  public void setDefaultSenderAccountNumber(String defaultSenderAccountNumber) {
    this.defaultSenderAccountNumber = defaultSenderAccountNumber;
  }


  public ProcessorApplicationConfig defaultSenderAddress(String defaultSenderAddress) {
    
    this.defaultSenderAddress = defaultSenderAddress;
    return this;
  }

   /**
   * The sender’s address.
   * @return defaultSenderAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sender’s address.")

  public String getDefaultSenderAddress() {
    return defaultSenderAddress;
  }


  public void setDefaultSenderAddress(String defaultSenderAddress) {
    this.defaultSenderAddress = defaultSenderAddress;
  }


  public ProcessorApplicationConfig defaultSenderCity(String defaultSenderCity) {
    
    this.defaultSenderCity = defaultSenderCity;
    return this;
  }

   /**
   * The city saved in the sender&#39;s address.
   * @return defaultSenderCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city saved in the sender's address.")

  public String getDefaultSenderCity() {
    return defaultSenderCity;
  }


  public void setDefaultSenderCity(String defaultSenderCity) {
    this.defaultSenderCity = defaultSenderCity;
  }


  public ProcessorApplicationConfig defaultSenderCountry(Country defaultSenderCountry) {
    
    this.defaultSenderCountry = defaultSenderCountry;
    return this;
  }

   /**
   * Get defaultSenderCountry
   * @return defaultSenderCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Country getDefaultSenderCountry() {
    return defaultSenderCountry;
  }


  public void setDefaultSenderCountry(Country defaultSenderCountry) {
    this.defaultSenderCountry = defaultSenderCountry;
  }


  public ProcessorApplicationConfig defaultSenderCountryCode(String defaultSenderCountryCode) {
    
    this.defaultSenderCountryCode = defaultSenderCountryCode;
    return this;
  }

   /**
   * The sender&#39;s 3 letter ISO 4217 currency code.
   * @return defaultSenderCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sender's 3 letter ISO 4217 currency code.")

  public String getDefaultSenderCountryCode() {
    return defaultSenderCountryCode;
  }


  public void setDefaultSenderCountryCode(String defaultSenderCountryCode) {
    this.defaultSenderCountryCode = defaultSenderCountryCode;
  }


  public ProcessorApplicationConfig defaultSenderCountyCode(String defaultSenderCountyCode) {
    
    this.defaultSenderCountyCode = defaultSenderCountyCode;
    return this;
  }

   /**
   * The sender’s county.
   * @return defaultSenderCountyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sender’s county.")

  public String getDefaultSenderCountyCode() {
    return defaultSenderCountyCode;
  }


  public void setDefaultSenderCountyCode(String defaultSenderCountyCode) {
    this.defaultSenderCountyCode = defaultSenderCountyCode;
  }


  public ProcessorApplicationConfig defaultSenderName(String defaultSenderName) {
    
    this.defaultSenderName = defaultSenderName;
    return this;
  }

   /**
   * The sender’s name.
   * @return defaultSenderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sender’s name.")

  public String getDefaultSenderName() {
    return defaultSenderName;
  }


  public void setDefaultSenderName(String defaultSenderName) {
    this.defaultSenderName = defaultSenderName;
  }


  public ProcessorApplicationConfig defaultSenderStateCode(String defaultSenderStateCode) {
    
    this.defaultSenderStateCode = defaultSenderStateCode;
    return this;
  }

   /**
   * The sender&#39;s 2-letter State code.
   * @return defaultSenderStateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sender's 2-letter State code.")

  public String getDefaultSenderStateCode() {
    return defaultSenderStateCode;
  }


  public void setDefaultSenderStateCode(String defaultSenderStateCode) {
    this.defaultSenderStateCode = defaultSenderStateCode;
  }


  public ProcessorApplicationConfig defaultSenderZipCode(String defaultSenderZipCode) {
    
    this.defaultSenderZipCode = defaultSenderZipCode;
    return this;
  }

   /**
   * The sender’s zip code.
   * @return defaultSenderZipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sender’s zip code.")

  public String getDefaultSenderZipCode() {
    return defaultSenderZipCode;
  }


  public void setDefaultSenderZipCode(String defaultSenderZipCode) {
    this.defaultSenderZipCode = defaultSenderZipCode;
  }


  public ProcessorApplicationConfig includeColombiaData(Boolean includeColombiaData) {
    
    this.includeColombiaData = includeColombiaData;
    return this;
  }

   /**
   * Must be true if transactions are in Colombia where there are different fees.
   * @return includeColombiaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Must be true if transactions are in Colombia where there are different fees.")

  public Boolean getIncludeColombiaData() {
    return includeColombiaData;
  }


  public void setIncludeColombiaData(Boolean includeColombiaData) {
    this.includeColombiaData = includeColombiaData;
  }


  public ProcessorApplicationConfig motoEciindicator(MotoEciindicatorEnum motoEciindicator) {
    
    this.motoEciindicator = motoEciindicator;
    return this;
  }

   /**
   * Identifies the level of security used in an electronic commerce transaction (only applies to card-present transactions).
   * @return motoEciindicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the level of security used in an electronic commerce transaction (only applies to card-present transactions).")

  public MotoEciindicatorEnum getMotoEciindicator() {
    return motoEciindicator;
  }


  public void setMotoEciindicator(MotoEciindicatorEnum motoEciindicator) {
    this.motoEciindicator = motoEciindicator;
  }


  public ProcessorApplicationConfig panEntryMode(PanEntryModeEnum panEntryMode) {
    
    this.panEntryMode = panEntryMode;
    return this;
  }

   /**
   * A 2-digit code that identifies the method used to enter the cardholder account number and card expiration date (only applies to card-present transactions).
   * @return panEntryMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A 2-digit code that identifies the method used to enter the cardholder account number and card expiration date (only applies to card-present transactions).")

  public PanEntryModeEnum getPanEntryMode() {
    return panEntryMode;
  }


  public void setPanEntryMode(PanEntryModeEnum panEntryMode) {
    this.panEntryMode = panEntryMode;
  }


  public ProcessorApplicationConfig posConditionCode(PosConditionCodeEnum posConditionCode) {
    
    this.posConditionCode = posConditionCode;
    return this;
  }

   /**
   * Contains a code identifying transaction conditions at the point of sale or point of service (only applies to card-present transactions).
   * @return posConditionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains a code identifying transaction conditions at the point of sale or point of service (only applies to card-present transactions).")

  public PosConditionCodeEnum getPosConditionCode() {
    return posConditionCode;
  }


  public void setPosConditionCode(PosConditionCodeEnum posConditionCode) {
    this.posConditionCode = posConditionCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorApplicationConfig processorApplicationConfig = (ProcessorApplicationConfig) o;
    return Objects.equals(this.achSettlementDelayDays, processorApplicationConfig.achSettlementDelayDays) &&
        Objects.equals(this.allowSplitPayouts, processorApplicationConfig.allowSplitPayouts) &&
        Objects.equals(this.allowedBusinessApplicationIds, processorApplicationConfig.allowedBusinessApplicationIds) &&
        Objects.equals(this.cardAcceptorIdCode, processorApplicationConfig.cardAcceptorIdCode) &&
        Objects.equals(this.cardAcceptorTerminalId, processorApplicationConfig.cardAcceptorTerminalId) &&
        Objects.equals(this.configurationTemplates, processorApplicationConfig.configurationTemplates) &&
        Objects.equals(this.defaultCurrencies, processorApplicationConfig.defaultCurrencies) &&
        Objects.equals(this.defaultMcc, processorApplicationConfig.defaultMcc) &&
        Objects.equals(this.defaultSenderAccountNumber, processorApplicationConfig.defaultSenderAccountNumber) &&
        Objects.equals(this.defaultSenderAddress, processorApplicationConfig.defaultSenderAddress) &&
        Objects.equals(this.defaultSenderCity, processorApplicationConfig.defaultSenderCity) &&
        Objects.equals(this.defaultSenderCountry, processorApplicationConfig.defaultSenderCountry) &&
        Objects.equals(this.defaultSenderCountryCode, processorApplicationConfig.defaultSenderCountryCode) &&
        Objects.equals(this.defaultSenderCountyCode, processorApplicationConfig.defaultSenderCountyCode) &&
        Objects.equals(this.defaultSenderName, processorApplicationConfig.defaultSenderName) &&
        Objects.equals(this.defaultSenderStateCode, processorApplicationConfig.defaultSenderStateCode) &&
        Objects.equals(this.defaultSenderZipCode, processorApplicationConfig.defaultSenderZipCode) &&
        Objects.equals(this.includeColombiaData, processorApplicationConfig.includeColombiaData) &&
        Objects.equals(this.motoEciindicator, processorApplicationConfig.motoEciindicator) &&
        Objects.equals(this.panEntryMode, processorApplicationConfig.panEntryMode) &&
        Objects.equals(this.posConditionCode, processorApplicationConfig.posConditionCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(achSettlementDelayDays, allowSplitPayouts, allowedBusinessApplicationIds, cardAcceptorIdCode, cardAcceptorTerminalId, configurationTemplates, defaultCurrencies, defaultMcc, defaultSenderAccountNumber, defaultSenderAddress, defaultSenderCity, defaultSenderCountry, defaultSenderCountryCode, defaultSenderCountyCode, defaultSenderName, defaultSenderStateCode, defaultSenderZipCode, includeColombiaData, motoEciindicator, panEntryMode, posConditionCode);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorApplicationConfig {\n");
    sb.append("    achSettlementDelayDays: ").append(toIndentedString(achSettlementDelayDays)).append("\n");
    sb.append("    allowSplitPayouts: ").append(toIndentedString(allowSplitPayouts)).append("\n");
    sb.append("    allowedBusinessApplicationIds: ").append(toIndentedString(allowedBusinessApplicationIds)).append("\n");
    sb.append("    cardAcceptorIdCode: ").append(toIndentedString(cardAcceptorIdCode)).append("\n");
    sb.append("    cardAcceptorTerminalId: ").append(toIndentedString(cardAcceptorTerminalId)).append("\n");
    sb.append("    configurationTemplates: ").append(toIndentedString(configurationTemplates)).append("\n");
    sb.append("    defaultCurrencies: ").append(toIndentedString(defaultCurrencies)).append("\n");
    sb.append("    defaultMcc: ").append(toIndentedString(defaultMcc)).append("\n");
    sb.append("    defaultSenderAccountNumber: ").append(toIndentedString(defaultSenderAccountNumber)).append("\n");
    sb.append("    defaultSenderAddress: ").append(toIndentedString(defaultSenderAddress)).append("\n");
    sb.append("    defaultSenderCity: ").append(toIndentedString(defaultSenderCity)).append("\n");
    sb.append("    defaultSenderCountry: ").append(toIndentedString(defaultSenderCountry)).append("\n");
    sb.append("    defaultSenderCountryCode: ").append(toIndentedString(defaultSenderCountryCode)).append("\n");
    sb.append("    defaultSenderCountyCode: ").append(toIndentedString(defaultSenderCountyCode)).append("\n");
    sb.append("    defaultSenderName: ").append(toIndentedString(defaultSenderName)).append("\n");
    sb.append("    defaultSenderStateCode: ").append(toIndentedString(defaultSenderStateCode)).append("\n");
    sb.append("    defaultSenderZipCode: ").append(toIndentedString(defaultSenderZipCode)).append("\n");
    sb.append("    includeColombiaData: ").append(toIndentedString(includeColombiaData)).append("\n");
    sb.append("    motoEciindicator: ").append(toIndentedString(motoEciindicator)).append("\n");
    sb.append("    panEntryMode: ").append(toIndentedString(panEntryMode)).append("\n");
    sb.append("    posConditionCode: ").append(toIndentedString(posConditionCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ach_settlement_delay_days");
    openapiFields.add("allow_split_payouts");
    openapiFields.add("allowed_business_application_ids");
    openapiFields.add("card_acceptor_id_code");
    openapiFields.add("card_acceptor_terminal_id");
    openapiFields.add("configuration_templates");
    openapiFields.add("default_currencies");
    openapiFields.add("default_mcc");
    openapiFields.add("default_sender_account_number");
    openapiFields.add("default_sender_address");
    openapiFields.add("default_sender_city");
    openapiFields.add("default_sender_country");
    openapiFields.add("default_sender_country_code");
    openapiFields.add("default_sender_county_code");
    openapiFields.add("default_sender_name");
    openapiFields.add("default_sender_state_code");
    openapiFields.add("default_sender_zip_code");
    openapiFields.add("include_colombia_data");
    openapiFields.add("moto_eciindicator");
    openapiFields.add("pan_entry_mode");
    openapiFields.add("pos_condition_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessorApplicationConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessorApplicationConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessorApplicationConfig is not found in the empty JSON string", ProcessorApplicationConfig.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProcessorApplicationConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProcessorApplicationConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("allowed_business_application_ids") != null && !jsonObj.get("allowed_business_application_ids").isJsonNull() && !jsonObj.get("allowed_business_application_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_business_application_ids` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_business_application_ids").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("card_acceptor_id_code") != null && !jsonObj.get("card_acceptor_id_code").isJsonNull()  && !jsonObj.get("card_acceptor_id_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_acceptor_id_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_acceptor_id_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("card_acceptor_terminal_id") != null && !jsonObj.get("card_acceptor_terminal_id").isJsonNull()  && !jsonObj.get("card_acceptor_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_acceptor_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_acceptor_terminal_id").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `configuration_templates`
     // if (jsonObj.getAsJsonObject("configuration_templates") != null) {
       //ProcessorApplicationConfigConfigurationTemplates.validateJsonObject(jsonObj.getAsJsonObject("configuration_templates"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("default_currencies") != null && !jsonObj.get("default_currencies").isJsonNull() && !jsonObj.get("default_currencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_currencies` to be an array in the JSON string but got `%s`", jsonObj.get("default_currencies").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_mcc") != null && !jsonObj.get("default_mcc").isJsonNull()  && !jsonObj.get("default_mcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_mcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_mcc").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_account_number") != null && !jsonObj.get("default_sender_account_number").isJsonNull()  && !jsonObj.get("default_sender_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_account_number").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_address") != null && !jsonObj.get("default_sender_address").isJsonNull()  && !jsonObj.get("default_sender_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_address").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_city") != null && !jsonObj.get("default_sender_city").isJsonNull()  && !jsonObj.get("default_sender_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_city").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_country_code") != null && !jsonObj.get("default_sender_country_code").isJsonNull()  && !jsonObj.get("default_sender_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_country_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_county_code") != null && !jsonObj.get("default_sender_county_code").isJsonNull()  && !jsonObj.get("default_sender_county_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_county_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_county_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_name") != null && !jsonObj.get("default_sender_name").isJsonNull()  && !jsonObj.get("default_sender_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_state_code") != null && !jsonObj.get("default_sender_state_code").isJsonNull()  && !jsonObj.get("default_sender_state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_state_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_sender_zip_code") != null && !jsonObj.get("default_sender_zip_code").isJsonNull()  && !jsonObj.get("default_sender_zip_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sender_zip_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sender_zip_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("moto_eciindicator") != null && !jsonObj.get("moto_eciindicator").isJsonNull()  && !jsonObj.get("moto_eciindicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moto_eciindicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moto_eciindicator").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("pan_entry_mode") != null && !jsonObj.get("pan_entry_mode").isJsonNull()  && !jsonObj.get("pan_entry_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan_entry_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan_entry_mode").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("pos_condition_code") != null && !jsonObj.get("pos_condition_code").isJsonNull()  && !jsonObj.get("pos_condition_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pos_condition_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pos_condition_code").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessorApplicationConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessorApplicationConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessorApplicationConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessorApplicationConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessorApplicationConfig>() {
           @Override
           public void write(JsonWriter out, ProcessorApplicationConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProcessorApplicationConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProcessorApplicationConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessorApplicationConfig
  * @throws IOException if the JSON string is invalid with respect to ProcessorApplicationConfig
  */
  public static ProcessorApplicationConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessorApplicationConfig.class);
  }

 /**
  * Convert an instance of ProcessorApplicationConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

