package soy.gabimoreno.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import soy.gabimoreno.domain.session.MemberSession
import soy.gabimoreno.domain.usecase.*
import soy.gabimoreno.framework.datastore.DataStoreMemberSession
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun provideSaveCredentialsInDataStoreUseCase(
        @ApplicationContext context: Context,
    ) = SaveCredentialsInDataStoreUseCase(context)

    @Provides
    @Singleton
    fun provideDataStoreMemberSession(
        @ApplicationContext context: Context,
    ): MemberSession = DataStoreMemberSession(context)

    @Provides
    @Singleton
    fun provideIsBearerTokenValid(
        @ApplicationContext context: Context,
    ) = IsBearerTokenValid(context)

    @Provides
    @Singleton
    fun provideSetJwtAuthTokenUseCase(
        @ApplicationContext context: Context,
    ) = SetJwtAuthTokenUseCase(context)

    @Provides
    @Singleton
    fun provideResetJwtAuthTokenUseCase(
        @ApplicationContext context: Context,
    ) = ResetJwtAuthTokenUseCase(context)

    @Provides
    @Singleton
    fun provideSaveLastPremiumAudiosFromRemoteRequestTimeMillisInDataStoreUseCase(
        @ApplicationContext context: Context,
    ) = SaveLastPremiumAudiosFromRemoteRequestTimeMillisInDataStoreUseCase(context)

    @Provides
    @Singleton
    fun provideGetLastPremiumAudiosFromRemoteRequestTimeMillisInDataStoreUseCase(
        @ApplicationContext context: Context,
    ) = GetLastPremiumAudiosFromRemoteRequestTimeMillisInDataStoreUseCase(context)
}
