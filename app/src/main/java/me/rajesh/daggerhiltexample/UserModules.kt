package me.rajesh.daggerhiltexample


import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class UserModules {

    @Provides
    @Named("sql")
    fun provideSQLRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

    @Provides
    @FirebaseAnnotation
    fun provideFirebaseRepository() : UserRepository {
        return FirebaseRepository()
    }

//    @Binds
//    abstract fun provideUserRepository(sqlRepository: SQLRepository) : UserRepository
}