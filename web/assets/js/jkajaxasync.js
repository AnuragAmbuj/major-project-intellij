/**
 * Created by Anurag Ambuj on 4/19/2016.
 */
/**
 *
 * This Javascript source is for the relevent ajax objects used in request and response communication ...
 *
 * */

function

sendXMLAsync(formId, statusURL, appURLString) {

    /*

     formId: Id of the form whose data is being sent
     statusURL: Address of the JSP/Servlet which will handle request
     appURLString: Appendable URL String of the form:
     If parameters are firstname and lastname and values are Huma and Qureshi respectively then:
     firstname=Huma&lastname=Qureshi
     For jaikisaan application on the web we are taking name,question and answer as parameters.
     Since the part of the pages are being refreshed.


     */
    var xmlRequest;
    if (window.XMLHttpRequest) {
        xmlRequest = new XMLHttpRequest();
    } else {
        // code for IE6, IE5
        xmlRequest = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlRequest.onreadystatechange = function () {
        if (xmlRequest.readyState == 4 && xmlRequest.status == 200) {
            parseXMLLoadAsync(xmlRequest.responseXML);
            delete xmlRequest;
            xmlRequest = null;
        }
    }
    xmlRequest.open("get", status_url + "?" + appURLString + "&id=" + formId, true);
    xmlRequest.send();
}

function isLoadingRequest() {
   return XMLHttpRequest.LOADING;
}

function parseXMLLoadAsync(xmldata) {


}

function showLivePopupDialogAsync(message) {

}
function commentReload(formId, recentListData) {

}

