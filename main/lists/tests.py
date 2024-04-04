from django.http import HttpRequest
from django.shortcuts import render
from django.template.loader import render_to_string
def home_page(request):
    return render(request, 'home.html')


def test_home_page_returns_correct_html(self):
    response = self.client.get('/')
    html = response.content.decode('utf8')
    self.assertTrue(html.startswith('<html>'))
    self.assertEqual('<title>To-Do list</title>', html)
    self.assertTrue(html.strip().endswith('</html>'))
    self.assertTemplateUsed(response, 'home.html')
    self.asertTemplateUsed(response, 'wrong.html')
# Create your tests here.
