/*
 * This file is part of ATLauncherAPIClientLibrary, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2017, Jamie Mansfield <https://www.jamierocks.uk/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package uk.jamierocks.atlauncher.api.v1.request;

import uk.jamierocks.atlauncher.api.request.GetRequest;
import uk.jamierocks.atlauncher.api.request.Request;
import uk.jamierocks.atlauncher.api.v1.model.LeaderboardUser;
import uk.jamierocks.atlauncher.api.v1.request.response.V1Responses;

import java.util.List;

/**
 * A psuedo-enum of {@link Request}s.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public final class V1Requests {

    public static final GetRequest.Builder<List<LeaderboardUser>> GLOBAL_LEADERBOARD =
            GetRequest.builder("/v1/leaderboards/global/%d/", V1Responses.Get.GlobalLeaderboard.class);

    private V1Requests() {
    }

}
