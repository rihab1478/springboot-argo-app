{{/* Generate full name for resources */}}
{{- define "postgresql.fullname" -}}
{{- printf "%s-%s" .Release.Name .Chart.Name | trunc 63 | trimSuffix "-" -}}
{{- end -}}

{{/* Short name */}}
{{- define "postgresql.name" -}}
{{- .Chart.Name -}}
{{- end -}}
