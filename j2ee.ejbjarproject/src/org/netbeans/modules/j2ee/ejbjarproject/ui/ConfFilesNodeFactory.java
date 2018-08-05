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

package org.netbeans.modules.j2ee.ejbjarproject.ui;

import java.util.Collections;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.modules.j2ee.ejbjarproject.EjbJarProject;
import org.netbeans.modules.j2ee.spi.ejbjar.support.J2eeProjectView;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.nodes.Node;

/**
 *
 * @author gpatil
 */
@NodeFactory.Registration(projectType="org-netbeans-modules-j2ee-ejbjarproject", position=200)
public class ConfFilesNodeFactory implements NodeFactory {

    public ConfFilesNodeFactory() {
    }

        @Override
    public NodeList<?> createNodes(Project p) {
        EjbJarProject project = p.getLookup().lookup(EjbJarProject.class);
        assert project != null;
        return new ConfFilesNodeList(project);
    }

    private static class ConfFilesNodeList implements NodeList<String> {
        private static final String CONF_FILES = "confFiles"; //NOI18N

        private final EjbJarProject project;

        ConfFilesNodeList(EjbJarProject proj) {
            this.project = proj;
        }
        
        @Override
        public List<String> keys() {
            return Collections.singletonList(CONF_FILES);
        }

        @Override
        public void addChangeListener(ChangeListener l) {
            // Ignore, not generating change event.
        }

        @Override
        public void removeChangeListener(ChangeListener l) {
            // Ignore, not generating change event.
        }

        @Override
        public Node node(String key) {
            if (CONF_FILES.equals(key)) {
                FileObject metaInf = project.getAPIEjbJar().getMetaInf();
                if (metaInf != null) {
                    return J2eeProjectView.createConfigFilesView(metaInf);
                } else {
                    return null;
                }
            }
            assert false: "No node for key: " + key; // NOI18N
            return null;
        }

        @Override
        public void addNotify() {
        }

        @Override
        public void removeNotify() {
        }
    }       
}
