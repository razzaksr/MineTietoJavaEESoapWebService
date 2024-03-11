Webservice with JavaEE :
		Server:
			Bean class
			List of bean class >> for listing beans object while select query
			Business class/ controller/service
			Endpoint>> run and get url with wsdl
			eg:
			http://localhost:8085/credits?wsdl
		Client:
			Wsimport -keep urlwithwsdl>> so that generate respective classes from wsdl
			or
			Wsimport -p package -keep urlwithwsdl

			eg:
			wsimport -keep http://localhost:8085/credits?wsdl
			Import properly in the generated classes if any shows error
			main>> create service object then get business class out of serice using port
			Finally call desired method in the server
