/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Dustin Sweigart
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

package net.notgandhi.blog.metadata;

import java.time.Duration;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static java.time.temporal.ChronoUnit.MILLIS;

/**
 * Metadata representing the runtime in seconds of a file
 *
 * @author Dustin Sweigart <dustin@swigg.net>
 */
public class Runtime extends AbstractMetadata<Long> {
    public static final String KEY = "runtime";

    protected Long value;

    /**
     * No-arg Constructor
     */
    protected Runtime() {
    }

    public Runtime(Duration runtime) {
        checkArgument(checkNotNull(runtime).get(MILLIS) > 0, "Argument `runtime` must represent a runtime greater than 0 milliseconds.");
        this.setValue(runtime.get(MILLIS));
    }

    public Runtime(Long runtime) {
        this(Duration.of(runtime, MILLIS));
    }

    @Override
    public Long getValue() {
        return this.value;
    }

    @Override
    public void setValue(Long value) {
        this.value = value;
    }

    public Duration getRuntime() {
        return Duration.of(this.getValue(), MILLIS);
    }

    @Override
    public String getKey() {
        return KEY;
    }

    @Override
    public boolean isUnique() {
        return true;
    }
}
