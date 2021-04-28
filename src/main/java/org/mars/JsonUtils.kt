package org.mars

/**
 * @author yanghai
 * @since 2021/4/28-11:31 上午
 */
open class JsonUtils {

    companion object {

        fun toJsonPretty(value: Any?): String? {
            return try {
                val mapper = JsonObjectMapper.objectMapper
                mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value)
            } catch (ex: Exception) {
                null
            }
        }

        fun toJson(value: Any?): String? {
            return try {
                val mapper = JsonObjectMapper.objectMapper
                mapper.writeValueAsString(value)
            } catch (ex: Exception) {
                null
            }
        }
    }
}