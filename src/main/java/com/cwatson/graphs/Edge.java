/*************************************************************************
 *
 * RST GROUP CONFIDENTIAL
 * ______________________
 *
 * [2007] - [2012] RST Group Inc.
 * All Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property
 * of RST Group Inc. and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to RST Group Inc.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret and copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from RST Group Inc.
 */
package com.cwatson.graphs;

/**
 * @author cwatson
 * @since 7/17/12
 */
public class Edge {
    Vertex one;
    Vertex two;

    public Edge(Vertex one, Vertex two) {
        this.one = one;
        this.two = two;
    }



}
