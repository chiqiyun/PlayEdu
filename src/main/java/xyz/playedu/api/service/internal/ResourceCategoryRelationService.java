/*
 * Copyright 2023 杭州白书科技有限公司
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.playedu.api.service.internal;

import com.baomidou.mybatisplus.extension.service.IService;

import xyz.playedu.api.domain.ResourceCategoryRelation;

import java.util.List;

/**
 * @author tengteng
 * @description 针对表【resource_category】的数据库操作Service
 * @createDate 2023-03-08 16:54:56
 */
public interface ResourceCategoryRelationService extends IService<ResourceCategoryRelation> {

    List<Integer> getRidsByCids(List<Integer> categoryIds);
}
