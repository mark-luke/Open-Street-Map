/*
 *  Copyright 2012 Peter Karich
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.graphhopper.coll;

/**
 * @author Peter Karich
 */
public interface BinHeapWrapper<K, V> {

    void update(V value, K key);

    void insert(V value, K key);

    boolean isEmpty();
    
    int size();

    K peekElement();

    V peekKey();

    K pollElement();

    // not necessary? V pollValue();

    void clear();
    
    void ensureCapacity(int size);
}
