/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opengoofy.indexticket.biz.ticketservice.service;

import java.util.List;

/**
 * 列车车厢接口层
 *
 * 
 */
public interface CarriageService {

    /**
     * 查询列车车厢号集合
     *
     * @param trainId      列车 ID
     * @param carriageType 车厢类型
     * @return 车厢号集合
     */
    List<String> listCarriageNumber(String trainId, Integer carriageType);
}
