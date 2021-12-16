package com.apollographql.apollo3.gradle.internal

import com.apollographql.apollo3.gradle.api.RegisterOperationsConfig
import org.gradle.api.provider.Property

abstract class DefaultRegisterOperationsConfig: RegisterOperationsConfig {
  abstract override val key: Property<String>
  abstract override val graph: Property<String>
  abstract override val graphVariant: Property<String>
}