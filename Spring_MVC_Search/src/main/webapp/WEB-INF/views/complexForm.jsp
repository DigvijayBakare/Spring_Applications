<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <title>Form in Card</title>
</head>
<body style="background-color: #e2e2e2;">
    <div class="container mt-4">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card">
                    <div class="card-body">
                        <h3 class="text-center">Complex Form</h3>
                        <form action="handleForm" method="POST">
                            <div class="form-group">
                                <label for="name">Your Name</label>
                                <input name="name" type="text" class="form-control" id="name" placeholder="Enter Name">
                                <small class="form-text text-muted">We'll never share your name with anyone else.</small>
                            </div>

                            <div class="form-group">
                                <label for="id">Your ID</label>
                                <input name="id" type="text" class="form-control" id="id" placeholder="Enter ID">
                            </div>

                            <div class="form-group">
                                <label for="dob">Your DOB</label>
                                <input name="dob" type="text" class="form-control" id="dob" placeholder="dd/mm/yyyy">
                            </div>

                            <div class="form-group">
                                <label for="courses">Select Courses</label>
                                <select name="courses" class="form-control" id="courses" multiple>
                                    <option>Java</option>
                                    <option>Python</option>
                                    <option>C++</option>
                                    <option>Django</option>
                                    <option>Spring Framework</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <span class="mr-3">Select Gender</span>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="gender" id="male" value="male">
                                    <label class="form-check-label" for="male">Male</label>
                                </div>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="gender" id="female" value="female">
                                    <label class="form-check-label" for="female">Female</label>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="type">Select Type</label>
                                <select class="form-control" name="type">
                                    <option value="oldstudent">Old Student</option>
                                    <option value="normalstudent">Normal Student</option>
                                </select>
                            </div>

                            <div class="text-center">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Optional JavaScript and Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
