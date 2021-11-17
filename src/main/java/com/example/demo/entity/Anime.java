package com.example.demo.entity;

// アニメの情報


public class Anime {

		//　アニメタイトルid
		private int id;
		// アニメタイトル
		private String title;
		//　アニメメモ
		private String memo;
		
		/**
		 * コンストラクタ（初期化メソッド）
		 * @param id
		 * @param title
		 * @param memo
		 */
		
		
		
		public Anime(int id, String title, String memo) {
			this.id = id;
			this.title = title;
			this.memo = memo;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getMeno() {
			return memo;
		}
		public void setMeno(String meno) {
			this.memo = meno;
		}
		
}
