package com.example.mc_project.Databases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/mc_project/Databases/MeetDao;", "", "getAll", "", "Lcom/example/mc_project/Databases/MeetEntity;", "getMeet", "id", "", "insert", "", "meetEntity", "(Lcom/example/mc_project/Databases/MeetEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface MeetDao {
    
    @androidx.room.Query(value = "SELECT * FROM Meets")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.mc_project.Databases.MeetEntity> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM Meets where Id= :id")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.mc_project.Databases.MeetEntity getMeet(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.mc_project.Databases.MeetEntity meetEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}