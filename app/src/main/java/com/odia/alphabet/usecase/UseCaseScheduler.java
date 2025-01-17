/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.odia.alphabet.usecase;

/**
 * Interface for schedulers, see {@link UseCaseThreadPoolScheduler}.
 */
public interface UseCaseScheduler {

    void execute(Runnable runnable);
     <V extends UseCase.ResponseValue, T extends UseCase.TaskFinished> void notifyResponse(final V response,
                                                                                           final UseCase.UseCaseCallback<V, T> useCaseCallback);
    <V extends UseCase.ResponseValue, T extends UseCase.TaskFinished> void onError(final UseCase.UseCaseCallback<V, T> useCaseCallback);
}
