package com.liqinchun.knowledge.knowledge.spring.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.IOException;

public class CustomModule extends SimpleModule {

    public CustomModule() {
        addSerializer(String.class, new ToStringSerializer());
    }

    @Override
    public String getModuleName() {
        return "CustomModule";
    }

    @Override
    public Version version() {
        return null;
    }

    @Override
    public void setupModule(SetupContext context) {
        super.setupModule(context);
    }

    static class BsonObjectIdDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            try {
                return p.getValueAsString();
            } catch (IllegalArgumentException e) {
                throw new InvalidFormatException(
                        p, "invalid ObjectId format", p.getValueAsString(), String.class);
            }
        }
    }

    static class StringSerializer extends JsonSerializer<String> {

        @Override
        public void serialize(String value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            gen.writeString(value);
        }
    }
}
