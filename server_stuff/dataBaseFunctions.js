var mongojs = require("mongojs");
var assert  = require("assert");
var url     = "mongodb://ukko.d.umn.edu:9090/dbfile";
var collection = ["names"];
var mydb = mongojs(url, collection);

// export functions
module.exports = {
    /**
     * Get all names
     */
    get:function(collectionName, callback) {
	mydb.collection(collectionName)
	    .find({})
	    .limit(300, function (err, docs) {
		if (err || !docs) {
		    console.log("get error");
		} else {
		    callback(docs);
		}
	    });
    }, // get

    /**
     * Get name
     */
    getName:function(collectionName, babyName, minYear, maxYear, callback) {
	console.log(babyName);
	    console.log(minYear);
	    mydb.collection(collectionName)
	    .find({ "name" : {$regex : babyName },
		    "year" : {$gte:minYear, $lte:maxYear}})
	    .limit(500, function(err, docs) {
		if (err || !docs) {
		    console.log("get error");
		} else {
		    callback(docs);
		}
	    });
    }, // getName
   
	//getPopularName
	getPopularName:function(collectionName, year, gender, callback){
		console.log(year);
		console.log(gender);
		mydb.collection(collectionName)
			.find({"year": {$eq: year},
				"sex": {$regex: gender}})
			.sort({"percent":-1})
			.limit(1, function(err, docs){
				if(err||!docs){
					console.log("get error");
				} else{
					callback(docs);
				}
			});
	}

}
