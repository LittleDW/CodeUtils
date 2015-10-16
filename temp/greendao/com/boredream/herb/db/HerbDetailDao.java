package com.boredream.herb.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.boredream.herb.db.HerbDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HERB_DETAIL".
*/
public class HerbDetailDao extends AbstractDao<HerbDetail, String> {

    public static final String TABLENAME = "HERB_DETAIL";

    /**
     * Properties of entity HerbDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Type = new Property(0, String.class, "type", false, "TYPE");
        public final static Property Name = new Property(1, String.class, "name", true, "NAME");
        public final static Property Letter = new Property(2, String.class, "letter", false, "LETTER");
        public final static Property Href = new Property(3, String.class, "href", false, "HREF");
        public final static Property Img = new Property(4, String.class, "img", false, "IMG");
        public final static Property Detail = new Property(5, String.class, "detail", false, "DETAIL");
    };


    public HerbDetailDao(DaoConfig config) {
        super(config);
    }
    
    public HerbDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HERB_DETAIL\" (" + //
                "\"TYPE\" TEXT," + // 0: type
                "\"NAME\" TEXT PRIMARY KEY NOT NULL ," + // 1: name
                "\"LETTER\" TEXT," + // 2: letter
                "\"HREF\" TEXT," + // 3: href
                "\"IMG\" TEXT," + // 4: img
                "\"DETAIL\" TEXT);"); // 5: detail
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HERB_DETAIL\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HerbDetail entity) {
        stmt.clearBindings();
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(1, type);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String letter = entity.getLetter();
        if (letter != null) {
            stmt.bindString(3, letter);
        }
 
        String href = entity.getHref();
        if (href != null) {
            stmt.bindString(4, href);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(5, img);
        }
 
        String detail = entity.getDetail();
        if (detail != null) {
            stmt.bindString(6, detail);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1);
    }    

    /** @inheritdoc */
    @Override
    public HerbDetail readEntity(Cursor cursor, int offset) {
        HerbDetail entity = new HerbDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // type
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // letter
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // href
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // img
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // detail
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HerbDetail entity, int offset) {
        entity.setType(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLetter(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setHref(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImg(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDetail(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(HerbDetail entity, long rowId) {
        return entity.getName();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(HerbDetail entity) {
        if(entity != null) {
            return entity.getName();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}