/*
 * The MIT License (MIT)
 *
 * Copyright (c) ${YEAR} Dustin Sweigart
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

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Metadata representing the dimensions of a file
 *
 * @author Dustin Sweigart <dustin@swigg.net>
 */
public class Dimensions extends AbstractMetadata<Integer[]> {
    public static final String KEY = "dimensions";

    protected Integer[] value;

    /**
     * No-arg Constructor
     */
    protected Dimensions() {
    }

    public Dimensions(Integer width, Integer height) {
        checkArgument(checkNotNull(width) > 0, "Argument `width` must represent a width greater than 0 pixels.");
        checkArgument(checkNotNull(height) > 0, "Argument `height` must represent a height greater than 0 pixels.");

        this.setDimensions(width, height);
    }

    @Override
    public Integer[] getValue() {
        return this.value;
    }

    @Override
    public void setValue(Integer[] value) {
        this.value = value;
    }

    private void setDimensions(int width, int height) {
        this.setValue(new Integer[]{width, height});
    }

    public Integer[] getDimensions() {
        return this.getValue();
    }

    public int getWidth() {
        return this.getDimensions()[0];
    }

    public int getHeight() {
        return this.getDimensions()[1];
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
