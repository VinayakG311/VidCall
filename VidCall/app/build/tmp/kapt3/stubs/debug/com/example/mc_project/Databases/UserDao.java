package com.example.mc_project.Databases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\'J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/mc_project/Databases/UserDao;", "", "delete", "", "getAll", "", "Lcom/example/mc_project/Databases/UserEntity;", "getUser", "Username", "", "insert", "userEntity", "(Lcom/example/mc_project/Databases/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface UserDao {
    
    @androidx.room.Query(value = "SELECT * FROM Users")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.mc_project.Databases.UserEntity> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM Users where Username= :Username ")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.mc_project.Databases.UserEntity getUser(@org.jetbrains.annotations.NotNull
    java.lang.String Username);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.mc_project.Databases.UserEntity userEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Users")
    public abstract void delete();
}