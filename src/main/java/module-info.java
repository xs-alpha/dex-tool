/**
 * Defines the Gson serialization/deserialization API.
 * @since 2.8.6
 */
module com.xiaosheng.tool.json {
	exports com.xiaosheng.tool.json;
	exports com.xiaosheng.tool.json.annotations;
	exports com.xiaosheng.tool.json.reflect;
	exports com.xiaosheng.tool.json.stream;

	requires transitive java.sql;
}
