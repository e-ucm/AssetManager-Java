/*
 * Copyright 2018 e-ucm, Universidad Complutense de Madrid
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

/**
 * Values that represent log severity.
 * <br/>
 *      See
 * <a href="https://msdn.microsoft.com/en-us/library/office/ff604025(v=office.14).aspx">Trace
 * and Event Log Severity Levels</a>
 */
public enum Severity
{
    /**
     * An enum constant representing the critical option.
     */
    Critical (1),

    /**
     * An enum constant representing the error option.
     */
    Error (2),

    /**
     * An enum constant representing the warning option.
     */
    Warning (4),

    /**
     * An enum constant representing the information option.
     */
    Information(8),

    /**
     * An enum constant representing the verbose option.
     */
    Verbose (16);

    private final int value;

    /**
     * Constructor
     *
     * @param value	The value.
     */
    Severity(final int value) {
        this.value=value;
    }

    /**
     * Gets the value
     *
     * @return The value.
     */
    public int getValue() {
            return value; 
    }
}