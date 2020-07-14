/*
 * Copyright (c) 2020 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.client.java.search.queries;

import com.couchbase.client.core.annotations.InterfaceAudience;
import com.couchbase.client.core.annotations.InterfaceStability;

/**
 * The {@link Coordinate} represents the longitude and latitude of a point.
 *
 * @author Jyotsna Nayak
 */
@InterfaceStability.Experimental
@InterfaceAudience.Public
public class Coordinate {

  private final double lon;
  private final double lat;

  public static Coordinate ofLonLat(double lon, double lat) {
    return new Coordinate(lon, lat);
  }

  private Coordinate(final double lon, final double lat) {
      this.lon = lon;
      this.lat = lat;
  }

  public double lon() {
    return lon;
  }

  public double lat() {
    return lat;
  }

}