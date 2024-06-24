package com.example.mc_project;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0007J\b\u0010&\u001a\u00020%H\u0007J\u0018\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010*\u001a\u00020%2\b\u0010+\u001a\u0004\u0018\u00010\t2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020%H\u0014J\b\u00102\u001a\u00020%H\u0014J\u0012\u00103\u001a\u00020%2\b\u00104\u001a\u0004\u0018\u000105H\u0016J1\u00106\u001a\u00020%2\u0010\u00107\u001a\f\u0012\u0006\b\u0001\u0012\u00020)\u0018\u0001082\u0006\u00109\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016\u00a2\u0006\u0002\u0010<R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006="}, d2 = {"Lcom/example/mc_project/MainActivity;", "Landroidx/activity/ComponentActivity;", "Lorg/jitsi/meet/sdk/JitsiMeetActivityInterface;", "Landroid/hardware/SensorEventListener;", "()V", "lightLevel", "Landroidx/compose/runtime/MutableState;", "", "lightSensor", "Landroid/hardware/Sensor;", "meetDao", "Lcom/example/mc_project/Databases/MeetDao;", "getMeetDao", "()Lcom/example/mc_project/Databases/MeetDao;", "setMeetDao", "(Lcom/example/mc_project/Databases/MeetDao;)V", "meetDatabase", "Lcom/example/mc_project/Databases/MeetDatabase;", "getMeetDatabase", "()Lcom/example/mc_project/Databases/MeetDatabase;", "setMeetDatabase", "(Lcom/example/mc_project/Databases/MeetDatabase;)V", "sensorManager", "Landroid/hardware/SensorManager;", "userDao", "Lcom/example/mc_project/Databases/UserDao;", "getUserDao", "()Lcom/example/mc_project/Databases/UserDao;", "setUserDao", "(Lcom/example/mc_project/Databases/UserDao;)V", "userDatabase", "Lcom/example/mc_project/Databases/UserDatabase;", "getUserDatabase", "()Lcom/example/mc_project/Databases/UserDatabase;", "setUserDatabase", "(Lcom/example/mc_project/Databases/UserDatabase;)V", "LightWarning", "", "LogoAndTitle", "MainScreen", "username", "", "onAccuracyChanged", "sensor", "accuracy", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "requestPermissions", "p0", "", "p1", "p2", "Lcom/facebook/react/modules/core/PermissionListener;", "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity implements org.jitsi.meet.sdk.JitsiMeetActivityInterface, android.hardware.SensorEventListener {
    public com.example.mc_project.Databases.UserDatabase userDatabase;
    public com.example.mc_project.Databases.UserDao userDao;
    public com.example.mc_project.Databases.MeetDatabase meetDatabase;
    public com.example.mc_project.Databases.MeetDao meetDao;
    private android.hardware.SensorManager sensorManager;
    @org.jetbrains.annotations.Nullable
    private android.hardware.Sensor lightSensor;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Float> lightLevel;
    
    public MainActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mc_project.Databases.UserDatabase getUserDatabase() {
        return null;
    }
    
    public final void setUserDatabase(@org.jetbrains.annotations.NotNull
    com.example.mc_project.Databases.UserDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mc_project.Databases.UserDao getUserDao() {
        return null;
    }
    
    public final void setUserDao(@org.jetbrains.annotations.NotNull
    com.example.mc_project.Databases.UserDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mc_project.Databases.MeetDatabase getMeetDatabase() {
        return null;
    }
    
    public final void setMeetDatabase(@org.jetbrains.annotations.NotNull
    com.example.mc_project.Databases.MeetDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mc_project.Databases.MeetDao getMeetDao() {
        return null;
    }
    
    public final void setMeetDao(@org.jetbrains.annotations.NotNull
    com.example.mc_project.Databases.MeetDao p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    public void onSensorChanged(@org.jetbrains.annotations.Nullable
    android.hardware.SensorEvent event) {
    }
    
    @java.lang.Override
    public void onAccuracyChanged(@org.jetbrains.annotations.Nullable
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @androidx.compose.runtime.Composable
    public final void LightWarning() {
    }
    
    @androidx.compose.runtime.Composable
    public final void MainScreen(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    com.example.mc_project.Databases.UserDao userDao) {
    }
    
    @androidx.compose.runtime.Composable
    public final void LogoAndTitle() {
    }
    
    @java.lang.Override
    public void requestPermissions(@org.jetbrains.annotations.Nullable
    java.lang.String[] p0, int p1, @org.jetbrains.annotations.Nullable
    com.facebook.react.modules.core.PermissionListener p2) {
    }
}