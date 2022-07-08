package payloads.utils;


import com.google.gson.*;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JsonLoader implements JsonSerializer<LocalDate> {
    Gson gson = new Gson();
    public Reader jsonReader(String path) throws IOException {
        return Files.newBufferedReader(Paths.get("/Users/default-admin/Documents/GitHub/finix-java/src/test/java/payloads/mokes/" + path));
    }
    public JsonElement serialize(LocalDate date, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // "yyyy-mm-dd"
    }
    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }
}