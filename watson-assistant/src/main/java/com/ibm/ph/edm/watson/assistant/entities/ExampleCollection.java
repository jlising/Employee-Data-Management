/*
 * (C) Copyright IBM Corp. 2017, 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.ph.edm.watson.assistant.entities;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.ph.edm.watson.assistant.entities.Example;
import com.ibm.ph.edm.watson.assistant.entities.Pagination;

import java.util.List;

/** ExampleCollection. */
public class ExampleCollection extends GenericModel {

  protected List<com.ibm.ph.edm.watson.assistant.entities.Example> examples;
  protected com.ibm.ph.edm.watson.assistant.entities.Pagination pagination;

  /**
   * Gets the examples.
   *
   * <p>An array of objects describing the examples defined for the intent.
   *
   * @return the examples
   */
  public List<Example> getExamples() {
    return examples;
  }

  /**
   * Gets the pagination.
   *
   * <p>The pagination data for the returned objects.
   *
   * @return the pagination
   */
  public Pagination getPagination() {
    return pagination;
  }
}
