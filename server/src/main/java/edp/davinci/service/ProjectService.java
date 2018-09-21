/*
 * <<
 * Davinci
 * ==
 * Copyright (C) 2016 - 2018 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * >>
 */

package edp.davinci.service;

import edp.davinci.core.common.ResultMap;
import edp.davinci.core.service.CheckEntityService;
import edp.davinci.dto.projectDto.ProjectCreat;
import edp.davinci.dto.projectDto.ProjectUpdate;
import edp.davinci.model.User;

import javax.servlet.http.HttpServletRequest;

public interface ProjectService extends CheckEntityService {

    ResultMap getProjectInfo(Long id, User user, HttpServletRequest request);

    ResultMap getProjects(User user, HttpServletRequest request);

    ResultMap createProject(ProjectCreat projectCreat, User user, HttpServletRequest request);

    ResultMap updateProject(Long id, ProjectUpdate projectUpdate, User user, HttpServletRequest request);

    ResultMap deleteProject(Long id, User user, HttpServletRequest request);

    ResultMap transferPeoject(Long id, Long orgId, User user, HttpServletRequest request);

    ResultMap searchProjects(String keywords, User user, int pageNum, int pageSize, HttpServletRequest request);

    ResultMap favoriteProject(Long id, User user, HttpServletRequest request);

    ResultMap getFavoriteProjects(User user, HttpServletRequest request);

    ResultMap removeFavoriteProjects(User user, Long[] projectIds, HttpServletRequest request);
}