/*
 * Copyright 2018 Open University of the Netherlands
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * This project has received funding from the European Union’s Horizon
 * 2020 research and innovation programme under grant agreement No 644187.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.rageproject.asset.manager;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Http Request class.
 *
 * @author Wim van der Vegt
 */
public class RequestSettings {
    /**
     * The method.
     */
    public String method;

    /**
     * URI of the document.
     */
    public URI uri;

    /**
     * The request headers.
     */
    public Map<String, String> requestHeaders;

    /**
     * The body.
     */
    public String body;

    /**
     * The allowed responses.
     */
    public List<Integer> allowedResponsCodes;

    /**
     * True to binary response.
     */
    public Boolean hasBinaryResponse;

    /**
     * Initializes a new instance of the AssetPackage.requestParameters class.
     */
    public RequestSettings() {
        method = "GET";
        requestHeaders = new HashMap<String, String>();
        body = "";
        allowedResponsCodes = new ArrayList<Integer>();
        allowedResponsCodes.add(200);
        hasBinaryResponse = false;
    }
}