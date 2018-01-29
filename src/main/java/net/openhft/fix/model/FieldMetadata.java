/*
 * Copyright 2013 peter.lawrey Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.fix.model;

import java.util.EnumSet;

/**
 * Used for a FIX field's meta data like number, position, types etc.
 *
 * @author Adam Rosenberger
 */
@SuppressWarnings("unused")
class FieldMetadata {
    private final int fieldNumber;
    private final FixField field;
    private final int position;
    private final int componentIndex;
    private final EnumSet<FieldType> fieldTypes;

    public FieldMetadata(int fieldNumber, FixField field, int position, int componentIndex) {
        this.fieldNumber = fieldNumber;
        this.field = field;
        this.position = position;
        this.componentIndex = componentIndex;
        this.fieldTypes = EnumSet.noneOf(FieldType.class);
    }
}

