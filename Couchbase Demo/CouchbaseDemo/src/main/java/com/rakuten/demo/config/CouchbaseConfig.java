package com.rakuten.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration{

	@Override
	public String getConnectionString() {
		// TODO Auto-generated method stub
		return "couchbase://127.0.0.1";
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return "admin";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "admin12";
	}

	@Override
	public String getBucketName() {
		// TODO Auto-generated method stub
		return "OrderBucket";
	}

}
