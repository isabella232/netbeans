/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.latte.indent;

import javax.swing.text.BadLocationException;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.IndentTask;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Ondrej Brejla <obrejla@netbeans.org>
 */
public class LatteIndentTask implements IndentTask, Lookup.Provider {
    private final LatteIndenter indenter;
    private final Lookup lookup;

    public LatteIndentTask(Context context) {
        indenter = new LatteIndenter(context);
        lookup = Lookups.singleton(indenter.createFormattingContext());
    }

    @Override
    public void reindent() throws BadLocationException {
        indenter.reindent();
    }

    @Override
    public ExtraLock indentLock() {
        return null;
    }

    @Override
    public Lookup getLookup() {
        return lookup;
    }

    public static final class Factory implements IndentTask.Factory {

        @Override
        public IndentTask createTask(Context context) {
            return new LatteIndentTask(context);
        }

    }
}
