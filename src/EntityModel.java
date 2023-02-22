
class EntityModel {
	private int userId;
	
	private int id;
	
	private String title;
	
	private String body;
	
	/**
	 * @return the userId
	 */
	int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the id
	 */
	int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	void setId(int id) {
		this.id = id;
	}	
	/**
	 * @return the title
	 */
	String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the body
	 */
	String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	void setBody(String body) {
		this.body = body;
	}

}
