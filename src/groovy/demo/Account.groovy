package demo

import  grails.validation.Validateable


@Validateable
class Account {
	String name
	Map moreInfo
	List transactions
}