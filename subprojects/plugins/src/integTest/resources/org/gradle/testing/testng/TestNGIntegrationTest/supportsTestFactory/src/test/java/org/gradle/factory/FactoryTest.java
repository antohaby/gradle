/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.factory;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA. User: Rene Date: 21.01.13 Time: 14:22 To change this template use File | Settings | File Templates.
 */
public class FactoryTest {

    private final String name;

    public FactoryTest(String name){
        this.name = name;
    }

    @Test
    public void printMethod(){
       System.out.println("Testing" + name);
    }
}
