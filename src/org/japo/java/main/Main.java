/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
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
package org.japo.java.main;

import java.util.Calendar;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static void main(String[] args) {
        int d;
        int m;
        int a;

        Calendar cal = Calendar.getInstance();

        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH) + 1;
        a = cal.get(Calendar.YEAR);

        System.out.printf("%s%02d/%02d/%02d%n", "Fecha del sistema ...: ", d, m, a);
    }
}
