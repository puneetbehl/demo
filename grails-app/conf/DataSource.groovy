
grails {
    mongodb {
       databaseName = "demo" // the default database name
       host = "localhost" // the host to connect to
       port = 27017 // the port to connect to
        // Alternatively, using 'replicaSet' or 'connectionString'
        // replicaSet = [ "localhost:27017", "localhost:27018"]
       //  connectionString = "mongodb://localhost:27017/sic"

        options {
            connectionsPerHost = 10 // The maximum number of connections allowed per host
            threadsAllowedToBlockForConnectionMultiplier = 5
            maxWaitTime = 120000 // Max wait time of a blocking thread for a connection.
            connectTimeout = 300 // The connect timeout in milliseconds. 0 == infinite
            socketTimeout = 60000 // The socket timeout. 0 == infinite
            socketKeepAlive = false // Whether or not to have socket keep alive turned on
            // writeConcern = new WriteConcern(0, 0, false) // Specifies the number of servers to wait for on the write operation, and exception raising behavior
            sslEnabled = false // Specifies if the driver should use an SSL connection to Mongo
            // socketFactory = … // Specifies the SocketFactory to use for creating connections
        }
    }
}