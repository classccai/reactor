/*
 * Copyright (c) 2011-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.fn;

/**
 * @author Jon Brisbin
 */
public class Tuple3<T1, T2, T3> extends Tuple2<T1, T2> {

	Tuple3(Object... values) {
		super(values);
	}

	/**
	 * Type-safe way to get the third object of this {@link Tuple}.
	 *
	 * @return The third object, cast to the correct type.
	 */
	@SuppressWarnings("unchecked")
	public T3 getT3() {
		return (T3) get(2);
	}

}
