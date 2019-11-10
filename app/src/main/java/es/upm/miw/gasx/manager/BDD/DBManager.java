package es.upm.miw.gasx.manager.BDD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import es.upm.miw.gasx.manager.BDD.GasStationContract.tableGasStation;

public class DBManager extends SQLiteOpenHelper {

    private static final String FILE_NAME = tableGasStation.TABLE_NAME + ".db";
    public static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + tableGasStation.TABLE_NAME + " (" +
                    tableGasStation._ID + " INTEGER PRIMARY KEY," +
                    tableGasStation.COL_NAME_CODE + " TEXT," +
                    tableGasStation.COL_NAME_ADDRESS + " TEXT," +
                    tableGasStation.COL_NAME_LABEL + " TEXT," +
                    tableGasStation.COL_NAME_MUNICIPALITY + " TEXT," +
                    tableGasStation.COL_NAME_PROVINCE + " TEXT," +
                    tableGasStation.COL_NAME_OPEN_HOURS + " TEXT," +
                    tableGasStation.COL_NAME_BIODIESEL_PRICE + " TEXT," +
                    tableGasStation.COL_NAME_BIOETANOL_PRICE + " TEXT," +
                    tableGasStation.COL_NAME_GAS_95_PRICE + " TEXT," +
                    tableGasStation.COL_NAME_GAS_98_PRICE + " TEXT," +
                    tableGasStation.COL_NAME_GASOLEO_A_PRICE+ " TEXT," +
                    tableGasStation.COL_NAME_GASOLEO_B_PRICE+ " TEXT," +
                    tableGasStation.COL_NAME_NUEVO_GASOLEO_A_PRICE+ " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + tableGasStation.TABLE_NAME;

    public DBManager(Context context) {
        super(context, FILE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
