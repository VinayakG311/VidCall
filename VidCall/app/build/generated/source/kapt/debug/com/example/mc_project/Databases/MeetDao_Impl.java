package com.example.mc_project.Databases;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MeetDao_Impl implements MeetDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MeetEntity> __insertionAdapterOfMeetEntity;

  public MeetDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMeetEntity = new EntityInsertionAdapter<MeetEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Meets` (`Id`,`Participants`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MeetEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getParticipants() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getParticipants());
        }
      }
    };
  }

  @Override
  public Object insert(final MeetEntity meetEntity, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMeetEntity.insert(meetEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public List<MeetEntity> getAll() {
    final String _sql = "SELECT * FROM Meets";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfParticipants = CursorUtil.getColumnIndexOrThrow(_cursor, "Participants");
      final List<MeetEntity> _result = new ArrayList<MeetEntity>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MeetEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpParticipants;
        if (_cursor.isNull(_cursorIndexOfParticipants)) {
          _tmpParticipants = null;
        } else {
          _tmpParticipants = _cursor.getString(_cursorIndexOfParticipants);
        }
        _item = new MeetEntity(_tmpId,_tmpParticipants);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public MeetEntity getMeet(final String id) {
    final String _sql = "SELECT * FROM Meets where Id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfParticipants = CursorUtil.getColumnIndexOrThrow(_cursor, "Participants");
      final MeetEntity _result;
      if (_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpParticipants;
        if (_cursor.isNull(_cursorIndexOfParticipants)) {
          _tmpParticipants = null;
        } else {
          _tmpParticipants = _cursor.getString(_cursorIndexOfParticipants);
        }
        _result = new MeetEntity(_tmpId,_tmpParticipants);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
