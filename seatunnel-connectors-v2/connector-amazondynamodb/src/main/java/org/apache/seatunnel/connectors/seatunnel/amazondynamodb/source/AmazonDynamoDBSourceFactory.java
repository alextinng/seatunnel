/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.connectors.seatunnel.amazondynamodb.source;

import static org.apache.seatunnel.connectors.seatunnel.amazondynamodb.config.AmazonDynamoDBConfig.ACCESS_KEY_ID;
import static org.apache.seatunnel.connectors.seatunnel.amazondynamodb.config.AmazonDynamoDBConfig.REGION;
import static org.apache.seatunnel.connectors.seatunnel.amazondynamodb.config.AmazonDynamoDBConfig.SECRET_ACCESS_KEY;
import static org.apache.seatunnel.connectors.seatunnel.amazondynamodb.config.AmazonDynamoDBConfig.TABLE;
import static org.apache.seatunnel.connectors.seatunnel.amazondynamodb.config.AmazonDynamoDBConfig.URL;

import org.apache.seatunnel.api.configuration.util.OptionRule;
import org.apache.seatunnel.api.table.factory.Factory;
import org.apache.seatunnel.api.table.factory.TableSourceFactory;
import org.apache.seatunnel.connectors.seatunnel.common.schema.SeaTunnelSchema;

import com.google.auto.service.AutoService;

@AutoService(Factory.class)
public class AmazonDynamoDBSourceFactory implements TableSourceFactory {
    @Override
    public String factoryIdentifier() {
        return "AmazonDynamoDB";
    }

    @Override
    public OptionRule optionRule() {
        return OptionRule.builder()
            .required(URL, REGION, ACCESS_KEY_ID, SECRET_ACCESS_KEY, TABLE, SeaTunnelSchema.SCHEMA).build();
    }
}