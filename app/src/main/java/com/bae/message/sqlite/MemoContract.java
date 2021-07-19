package com.bae.message.sqlite;

import android.provider.BaseColumns;

public final class MemoContract {

    private MemoContract() {

    }

    public static class MemoEntry implements BaseColumns {
        public static final String TABLE_NAME = "memo";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_CONTENTS = "contents";

    }
}

