/*
# FILE: CharNode.java
# USAGE: --
# DESCRIPTION:
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/27/2020
REVISION: --
*/

// package Lab07;

public class CharNode {

	private CharNode link;
	private char info;
	  
	public CharNode(char info)
	{
		this.info = info;
		this.link = null;
	}

	public CharNode(char c, CharNode link)
	{
		this.info = info;
		this.link = link;
	}

	public CharNode getLink() {
		return link;
	}

	public void setLink(CharNode link) {
		this.link = link;
	}

	public char getInfo() {
		return info;
	}

	public void setInfo(char info) {
		this.info = info;
	}
}

