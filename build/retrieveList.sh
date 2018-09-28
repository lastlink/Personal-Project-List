while getopts ":i:" opt; do
  case $opt in
    i) id="$OPTARG"
    ;;
    \?) echo "Invalid option -$OPTARG" >&2
    ;;
  esac
done

printf "Argument id is %s\n" "$id"
# backup last list
cp -a ../config/data/list.json "../config/data/backups/list-$(date +"%m-%d-%y-%r").json"

curl --request GET \
  --url http://api.jsoneditoronline.org/v1/docs/$id/data --output ../config/data/list.json
