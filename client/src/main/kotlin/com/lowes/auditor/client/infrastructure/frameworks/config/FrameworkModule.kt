package com.lowes.auditor.client.infrastructure.frameworks.config

import com.lowes.auditor.client.entities.domain.AuditorEventConfig
import com.lowes.auditor.client.entities.interfaces.infrastructure.frameworks.ObjectDiffChecker
import com.lowes.auditor.client.entities.interfaces.infrastructure.frameworks.ObjectLogGenerator
import com.lowes.auditor.client.infrastructure.frameworks.service.DefaultLogProvider
import com.lowes.auditor.client.infrastructure.frameworks.service.ObjectDiffCheckerService
import com.lowes.auditor.client.infrastructure.frameworks.service.ObjectLogGeneratorService
import com.lowes.auditor.core.entities.util.JsonObject

object FrameworkModule {

    fun getObjectDiffChecker(auditorEventConfig: AuditorEventConfig): ObjectDiffChecker {
        return ObjectDiffCheckerService(JsonObject.objectMapper, auditorEventConfig)
    }

    val defaultLogProvider: DefaultLogProvider by lazy {
        DefaultLogProvider()
    }

    val objectLogGenerator: ObjectLogGenerator by lazy {
        ObjectLogGeneratorService(JsonObject.objectMapper)
    }
}
