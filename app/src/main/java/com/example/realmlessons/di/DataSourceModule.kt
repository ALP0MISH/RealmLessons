package com.example.realmlessons.di

import com.example.realmlessons.data.cashe.source.CommonDataSource
import com.example.realmlessons.data.cashe.source.CommonDataSourceImpl
import com.example.realmlessons.data.cloud.source.CameraAndDoorCloudDataSource
import com.example.realmlessons.data.cloud.source.CameraAndDoorCloudDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    fun bindsCommonDataSource(
        implementation: CommonDataSourceImpl
    ): CommonDataSource

    @Binds
    fun bindsCameraAndDoorDataSource(
        implementation: CameraAndDoorCloudDataSourceImpl
    ): CameraAndDoorCloudDataSource
}