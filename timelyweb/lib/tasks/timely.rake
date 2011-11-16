namespace :timely do
  desc "WARNING: Drop db and redo all migrations - all data gone!"
  task :remi do
    Rake::Task['db:drop'].invoke
    Rake::Task['db:create'].invoke
    Rake::Task['db:migrate'].invoke
  end
  
  desc "Watch for file changes, run test on change"
  task :watch do
    sh %{bundle exec watchr .watchr}
  end
  
  desc "Load Spork Cucumber listener"
  task :autotest do
    sh %{bundle exec spork cucumber}
  end
  
  desc "Load Spork RSpec2 listener"
  task :autospec do
    sh %{bundle exec spork rspec}
  end
end