package org.mars

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

/**
 * @author yanghai
 * @since 2021/4/28-2:51 下午
 */
open class JsonObjectMapper private constructor() {
    companion object {

        private fun newObjectMapper(): ObjectMapper {
            val mapper = ObjectMapper()
            mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS)
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            mapper.configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, true)
            mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            return mapper
        }

        @JvmStatic
        val objectMapper = newObjectMapper()

        private val INSTANCE = JsonObjectMapper()

        @JvmStatic
        fun getInstance(): JsonObjectMapper {
            return INSTANCE
        }
    }
}