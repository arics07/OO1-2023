package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean featured;
	

	
	public WallPostImpl() {
		this.text = "Undefined post";
		this.likes = 0;
		this.featured = false;
	}
	
	
	public String getText() {
		return text;
	}
	
	
	public void setText(String text) {
		this.text = text;
	}


	public int getLikes() {
		return likes;
	}

	
	public void like() {
		this.likes += 1;
	}
	
	public void dislike() {
		if (this.likes > 0) {
			this.likes -= 1;
		}
	}

	public boolean isFeatured() {
		return featured;
	}



	public void toggleFeatured() {
		if (this.featured) {
			this.featured = false;
		} else {
			this.featured = true;
		}
	}



	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
